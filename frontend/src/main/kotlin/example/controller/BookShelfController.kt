package example.controller

import org.springframework.web.bind.annotation.DeleteMapping
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController
import reactor.core.publisher.Mono
import example.grpc.client.BookClient
import example.grpc.client.BookShelfClient
import example.model.BookShelf
import reactor.core.publisher.Flux
import java.util.logging.Logger

@RestController
@RequestMapping("/api/bookshelfs")
class BookShelfController(
        val bookShelfClient: BookShelfClient,
        val bookClient: BookClient
) {
    val log = Logger.getLogger(this.javaClass.name)

    @PostMapping("")
    fun create(@RequestBody bookShelf: BookShelf): Mono<BookShelf> = bookShelfClient.create(bookShelf)

    @GetMapping("")
    fun findAll(): Flux<BookShelf> {
        val stream = bookShelfClient.findAll().map {bookShelf ->
            val books = bookClient.findByIds(bookShelf.bookIds).collectList().block()
            log.info("books:${books}")
            bookShelf.books = books
            bookShelf
        }.toStream()

        return Flux.fromStream(stream)
    }

    @PostMapping("/{id}/books/{bookId}")
    fun addBook(@PathVariable id: Long, @PathVariable bookId: Long) = bookShelfClient.addBook(id, bookId)

    @DeleteMapping("/{id}")
    fun delete(@PathVariable id: Long) = bookShelfClient.delete(id)
}
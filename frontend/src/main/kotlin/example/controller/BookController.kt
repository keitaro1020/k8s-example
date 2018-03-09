package example.controller

import com.google.protobuf.Empty
import org.springframework.web.bind.annotation.DeleteMapping
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController
import reactor.core.publisher.Mono
import example.grpc.client.BookClient
import example.model.Book

@RestController
@RequestMapping("/api/books")
class BookController(val bookClient: BookClient) {

    @PostMapping("")
    fun create(@RequestBody book: Book): Mono<Book> = bookClient.create(book)

    @GetMapping("")
    fun findAll(): Mono<List<Book>> = bookClient.findAll()

    @DeleteMapping("/{id}")
    fun delete(@PathVariable id: Long) = bookClient.delete(id)
}
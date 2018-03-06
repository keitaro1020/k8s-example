package sample.controller

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController
import reactor.core.publisher.Flux
import reactor.core.publisher.Mono
import sample.grpc.client.BookClient
import sample.model.Book

@RestController
@RequestMapping("/api/books")
class BookController(val bookClient: BookClient) {

    @PostMapping("")
    fun create(@RequestBody book: Book ): Mono<Book> = bookClient.create(book)

    @GetMapping("")
    fun findAll(): Mono<List<Book>> = bookClient.findAll()

}
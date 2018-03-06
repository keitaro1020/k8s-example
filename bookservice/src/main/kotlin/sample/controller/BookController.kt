package sample.controller

import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.DeleteMapping
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RestController
import sample.model.Book
import sample.dao.BookDao

@RestController
class BookController(val bookDao: BookDao) {

    @GetMapping("")
    fun getAll(): ResponseEntity<List<Book>> = ResponseEntity.ok(bookDao.selectAll())

    @PostMapping("")
    fun create(@RequestBody book: Book) = bookDao.insert(book)

    @DeleteMapping("/{id}")
    fun delete(@PathVariable id: Long) = bookDao.delete(id)
}
package example.dao

import org.jetbrains.exposed.sql.Table
import org.jetbrains.exposed.sql.deleteWhere
import org.jetbrains.exposed.sql.insert
import org.jetbrains.exposed.sql.selectAll
import org.springframework.stereotype.Repository
import org.springframework.transaction.annotation.Transactional
import example.model.Book
import org.jetbrains.exposed.sql.select

object Books: Table() {
    val id = long("id").autoIncrement().primaryKey()
    val title = text("title")
    val author = text("author")
}

@Repository
@Transactional
class BookDao {
    fun selectAll(): List<Book> =
            Books.selectAll().map {
                Book(
                        id = it[Books.id],
                        title = it[Books.title],
                        author = it[Books.author]
                )
            }

    fun insert(book: Book): Book {
        val id = Books.insert {
            it[title] = book.title
            it[author] = book.author
        }.get(Books.id)

        return book.copy(id = id)
    }

    fun delete(id: Long) = Books.deleteWhere {
        Books.id eq id
    }

    fun findByIds(ids: List<Long>): List<Book> =
            Books.select {
                Books.id.inList(ids)
            }.map {
                Book(
                        id = it[Books.id],
                        title = it[Books.title],
                        author = it[Books.author]
                )
            }

}
package example.dao

import example.model.BookShelf
import org.jetbrains.exposed.sql.SqlExpressionBuilder.eq
import org.jetbrains.exposed.sql.Table
import org.jetbrains.exposed.sql.deleteWhere
import org.jetbrains.exposed.sql.insert
import org.jetbrains.exposed.sql.select
import org.jetbrains.exposed.sql.selectAll
import org.springframework.stereotype.Repository
import org.springframework.transaction.annotation.Transactional

object BookShelfs: Table() {
    val id = long("id").autoIncrement().primaryKey()
    val title = text("title")
    val description = text("description")
}

object BookShelfBooks: Table("bookshelf_books") {
    val id = long("id").autoIncrement().primaryKey()
    val bookshelfId = long("bookshelf_id")
    val bookId = long("book_id")
}

@Repository
@Transactional
class BookShelfDao {

    fun insert(bookShelf: BookShelf): BookShelf {
        val id = BookShelfs.insert {
            it[title] = bookShelf.title
            it[description] = bookShelf.description
        }.get(BookShelfs.id)

        id?.let {
            bookShelf.bookIds.forEach { bookId ->
                BookShelfBooks.insert {
                    it[BookShelfBooks.bookshelfId] = id
                    it[BookShelfBooks.bookId] = bookId
                }
            }
        }

        return bookShelf.copy(id = id)
    }

    fun selectAll(): List<BookShelf> {
        val shelfBooksMap = BookShelfBooks.selectAll().groupBy(
                {it[BookShelfBooks.bookshelfId]},
                {it[BookShelfBooks.bookId]})

        val shelfs = BookShelfs.selectAll().map {
            BookShelf(
                    id = it[BookShelfs.id],
                    title = it[BookShelfs.title],
                    description = it[BookShelfs.description],
                    bookIds = shelfBooksMap[it[BookShelfs.id]] ?: emptyList()
            )
        }

        return shelfs
    }

    fun findById(id: Long): BookShelf? {
        val shelfBooks = BookShelfBooks.select {
            BookShelfBooks.bookshelfId eq id
        }.map { it[BookShelfBooks.bookId] }

        return BookShelfs.select {
            BookShelfs.id eq id
        }.map {
            BookShelf(
                    id = it[BookShelfs.id],
                    title = it[BookShelfs.title],
                    description = it[BookShelfs.description],
                    bookIds = shelfBooks
            )
        }.firstOrNull()
    }

    fun addBook(shelfId: Long, bookId: Long): BookShelf? {
        BookShelfBooks.insert {
            it[BookShelfBooks.bookshelfId] = shelfId
            it[BookShelfBooks.bookId] = bookId
        }

        return findById(shelfId)
    }

    fun delete(id: Long) {
        BookShelfs.deleteWhere {
            BookShelfs.id eq id
        }
        BookShelfBooks.deleteWhere {
            BookShelfBooks.bookshelfId eq id
        }
    }
}
package example.grpc

import com.google.protobuf.Empty
import example.BookShelfServiceGrpc
import example.Bookshelf as BookshelfOuterClass
import example.dao.BookShelfDao
import example.model.BookShelf
import io.grpc.stub.StreamObserver
import org.lognet.springboot.grpc.GRpcService

@GRpcService
class BookShelfService(val bookShelfDao: BookShelfDao): BookShelfServiceGrpc.BookShelfServiceImplBase() {

    override fun create(request: BookshelfOuterClass.CreateBookShelfRequest, responseObserver: StreamObserver<BookshelfOuterClass.BookShelf>) {
        val bookShelf = bookShelfDao.insert(BookShelf(id = null, title = request.title, description = request.description, bookIds = emptyList()))

        bookShelf.id?.let {
            val builder = BookshelfOuterClass.BookShelf.newBuilder()
            builder.let{
                it.id = bookShelf.id
                it.title = bookShelf.title
                it.description = bookShelf.description
                it.addAllBookId(bookShelf.bookIds)
            }
            responseObserver.onNext(builder.build())
            responseObserver.onCompleted()
        }
    }

    override fun findAll(request: Empty, responseObserver: StreamObserver<example.Bookshelf.BookShelfs>) {
        val list = bookShelfDao.selectAll()

        val builder = BookshelfOuterClass.BookShelfs.newBuilder()
        builder.addAllBookShelfs(
                list.map { bookShelf ->
                    val builder = BookshelfOuterClass.BookShelf.newBuilder()
                    builder.let {
                        it.id = bookShelf?.id ?: 0
                        it.title = bookShelf.title
                        it.description = bookShelf.description
                        it.addAllBookId(bookShelf.bookIds)
                    }
                    builder.build()
                }
        )
        responseObserver.onNext(builder.build())
        responseObserver.onCompleted()
    }

    override fun addBook(request: example.Bookshelf.AddBookRequest, responseObserver: StreamObserver<example.Bookshelf.BookShelf>) {

        val bookShelf = bookShelfDao.addBook(request.id, request.bookId)
        bookShelf?.let {
            val builder = BookshelfOuterClass.BookShelf.newBuilder()
            builder.let{
                it.id = bookShelf?.id ?: 0
                it.title = bookShelf.title
                it.description = bookShelf.description
                it.addAllBookId(bookShelf.bookIds)
            }
            responseObserver.onNext(builder.build())
            responseObserver.onCompleted()
        }
    }

    override fun delete(request: example.Bookshelf.DeleteBookShelfRequest, responseObserver: StreamObserver<Empty>) {
        bookShelfDao.delete(id = request.id)
        responseObserver.onNext(Empty.newBuilder().build())
        responseObserver.onCompleted()
    }
}
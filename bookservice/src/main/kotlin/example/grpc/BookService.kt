package example.grpc

import com.google.protobuf.Empty
import io.grpc.stub.StreamObserver
import org.lognet.springboot.grpc.GRpcService
import example.BookOuterClass
import example.BookServiceGrpc
import example.dao.BookDao
import example.model.Book
import java.util.logging.Logger

@GRpcService
class BookService(val bookDao: BookDao): BookServiceGrpc.BookServiceImplBase() {
    override fun create(request: BookOuterClass.CreateBookRequest, responseObserver: StreamObserver<BookOuterClass.Book>) {
        val book = bookDao.insert(Book(id = null, title = request.title, author = request.author))

        book.id?.let {
            val builder = BookOuterClass.Book.newBuilder()
            builder.let{
                it.id = book.id
                it.title = book.title
                it.author = book.author
            }
            responseObserver.onNext(builder.build())
            responseObserver.onCompleted()
        }
    }

    override fun findAll(request: Empty, responseObserver: StreamObserver<BookOuterClass.Books>) {
        val list = bookDao.selectAll()

        val builder = BookOuterClass.Books.newBuilder()
        builder.addAllBooks(
            list.map { book ->
                val builder = BookOuterClass.Book.newBuilder()
                builder.let {
                    it.id = book?.id ?: 0
                    it.title = book.title
                    it.author = book.author
                }
                builder.build()
            }
        )
        responseObserver.onNext(builder.build())
        responseObserver.onCompleted()
    }

    override fun delete(request: BookOuterClass.DeleteBookRequest, responseObserver: StreamObserver<Empty>) {
        bookDao.delete(id = request.id)
        responseObserver.onNext(Empty.newBuilder().build())
        responseObserver.onCompleted()
    }

    val log = Logger.getLogger(this.javaClass.name)
    override fun findByIds(request: BookOuterClass.FindBookByIdsRequest, responseObserver: StreamObserver<BookOuterClass.Books>) {
        val list = bookDao.findByIds(request.idList)
        log.info("${request.idList}: ${list}")

        val builder = BookOuterClass.Books.newBuilder()
        builder.addAllBooks(
                list.map { book ->
                    val builder = BookOuterClass.Book.newBuilder()
                    builder.let {
                        it.id = book?.id ?: 0
                        it.title = book.title
                        it.author = book.author
                    }
                    builder.build()
                }
        )
        responseObserver.onNext(builder.build())
        responseObserver.onCompleted()
    }
}
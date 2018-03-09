package sample.grpc

import com.google.protobuf.Empty
import io.grpc.stub.StreamObserver
import org.lognet.springboot.grpc.GRpcService
import sample.BookOuterClass
import sample.BookServiceGrpc
import sample.dao.BookDao
import sample.model.Book

@GRpcService
class BookService(val bookDao: BookDao): BookServiceGrpc.BookServiceImplBase() {
    override fun create(request: BookOuterClass.CreateRequest, responseObserver: StreamObserver<BookOuterClass.Book>) {
        val book = bookDao.insert(Book(id = null, title = request.title, author = request.author))

        if(book.id != null) {
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

    override fun delete(request: BookOuterClass.DeleteRequest, responseObserver: StreamObserver<Empty>) {
        bookDao.delete(id = request.id)
        responseObserver.onNext(Empty.newBuilder().build())
        responseObserver.onCompleted()
    }
}
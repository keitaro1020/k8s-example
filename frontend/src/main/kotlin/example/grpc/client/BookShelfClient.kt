package example.grpc.client

import com.google.protobuf.Empty
import io.grpc.ManagedChannel
import io.grpc.okhttp.OkHttpChannelBuilder
import org.springframework.core.env.Environment
import org.springframework.stereotype.Component
import reactor.core.publisher.Mono
import example.Bookshelf as BookshelfOuterClass
import example.BookShelfServiceGrpc
import example.model.BookShelf
import reactor.core.publisher.Flux
import java.util.logging.Logger

@Component
class BookShelfClient(
        val env: Environment
){

    private lateinit var hostname: String
    private lateinit var port: String

    init {
        hostname = env.getProperty("grpc.bookshelf.hostname", "")
        port = env.getProperty("grpc.bookshelf.port", "")
    }

    fun create(bookShelf: BookShelf): Mono<BookShelf> {

        val channel = getChannel()
        try {
            val stub = BookShelfServiceGrpc.newBlockingStub(getChannel())
            val reqBuilder = BookshelfOuterClass.CreateBookShelfRequest.newBuilder()
            reqBuilder.let {
                it.title = bookShelf.title
                it.description = bookShelf.description
            }
            val res = stub.create(reqBuilder.build())

            return Mono.just(BookShelf(
                    id = res.id,
                    title = res.title,
                    description = res.description,
                    bookIds = res.bookIdList.toList()))
        } finally {
            channel.shutdown()
        }
    }

    fun findAll(): Flux<BookShelf> {

        val channel = getChannel()
        try {
            val stub = BookShelfServiceGrpc.newBlockingStub(getChannel())
            val reqBuilder = Empty.newBuilder()
            val res = stub.findAll(reqBuilder.build()).bookShelfsList.map {
                BookShelf(
                        id = it.id,
                        title = it.title,
                        description = it.description,
                        bookIds = it.bookIdList.toList()
                )
            }

            return Flux.fromStream(res.stream())
        } finally {
            channel.shutdown()
        }
    }

    fun addBook(id: Long, bookId: Long): Mono<BookShelf> {
        val channel = getChannel()
        try {
            val stub = BookShelfServiceGrpc.newBlockingStub(getChannel())
            val reqBuilder = BookshelfOuterClass.AddBookRequest.newBuilder()
            reqBuilder.let {
                it.id = id
                it.bookId = bookId
            }
            val res = stub.addBook(reqBuilder.build())

            return Mono.just(BookShelf(
                    id = res.id,
                    title = res.title,
                    description = res.description,
                    bookIds = res.bookIdList.toList()))
        } finally {
            channel.shutdown()
        }
    }

    fun delete(id: Long) {

        logger.info("id:${id}")
        val channel = getChannel()
        try {
            val stub = BookShelfServiceGrpc.newBlockingStub(getChannel())
            val reqBuilder = BookshelfOuterClass.DeleteBookShelfRequest.newBuilder()
            reqBuilder.id = id
            stub.delete(reqBuilder.build())
        } finally {
            channel.shutdown()
        }
    }

    val logger = Logger.getLogger(this.javaClass.name)
    private fun getChannel() : ManagedChannel {
        logger.info("hostname: ${hostname}, port: ${port}")

        return OkHttpChannelBuilder.forAddress(hostname, port.toInt())
                .usePlaintext(true)
                .build()    }
}
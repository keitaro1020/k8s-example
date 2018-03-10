package example.grpc.client

import com.google.protobuf.Empty
import io.grpc.ManagedChannel
import io.grpc.okhttp.OkHttpChannelBuilder
import org.springframework.core.env.Environment
import org.springframework.stereotype.Component
import reactor.core.publisher.Mono
import example.BookOuterClass
import example.BookServiceGrpc
import example.controller.HealthzController
import example.model.Book
import reactor.core.publisher.Flux
import java.util.logging.Logger

@Component
class BookClient (
        val env: Environment
){

    private lateinit var hostname: String
    private lateinit var port: String

    init {
        hostname = env.getProperty("grpc.book.hostname", "")
        port = env.getProperty("grpc.book.port", "")
    }

    fun create(book: Book): Mono<Book> {

        val channel = getChannel()
        try {
            val stub = BookServiceGrpc.newBlockingStub(getChannel())
            val reqBuilder = BookOuterClass.CreateBookRequest.newBuilder()
            reqBuilder.let {
                it.title = book.title
                it.author = book.author
            }
            val res = stub.create(reqBuilder.build())

            return Mono.just(Book(
                    id = res.id,
                    title = res.title,
                    author = res.author))
        } finally {
            channel.shutdown()
        }
    }

    fun findAll(): Flux<Book> {

        val channel = getChannel()
        try {
            val stub = BookServiceGrpc.newBlockingStub(getChannel())
            val reqBuilder = Empty.newBuilder()
            val res = stub.findAll(reqBuilder.build()).booksList.map {
                Book(
                        id = it.id,
                        title = it.title,
                        author = it.author
                )
            }

            return Flux.fromStream(res.stream())
        } finally {
            channel.shutdown()
        }
    }

    fun delete(id: Long) {

        val channel = getChannel()
        try {
            val stub = BookServiceGrpc.newBlockingStub(getChannel())
            val reqBuilder = BookOuterClass.DeleteBookRequest.newBuilder()
            reqBuilder.id = id
            stub.delete(reqBuilder.build())
        } finally {
            channel.shutdown()
        }
    }

    fun findByIds(ids: List<Long>): Flux<Book> {

        val channel = getChannel()
        try {
            val stub = BookServiceGrpc.newBlockingStub(getChannel())
            val reqBuilder = BookOuterClass.FindBookByIdsRequest.newBuilder()
            reqBuilder.addAllId(ids)
            val res = stub.findByIds(reqBuilder.build()).booksList.map {
                Book(
                        id = it.id,
                        title = it.title,
                        author = it.author
                )
            }

            return Flux.fromStream(res.stream())
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
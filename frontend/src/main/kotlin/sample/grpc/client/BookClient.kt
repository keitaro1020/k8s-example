package sample.grpc.client

import com.google.protobuf.Empty
import io.grpc.okhttp.OkHttpChannelBuilder
import org.springframework.boot.context.properties.ConfigurationProperties
import org.springframework.stereotype.Component
import reactor.core.publisher.Flux
import reactor.core.publisher.Mono
import sample.BookOuterClass
import sample.BookServiceGrpc
import sample.model.Book
import java.util.*

@Component
@ConfigurationProperties(prefix = "grpc.book")
class BookClient {

    private var hostname: String = "localhost"
    private var port: Int = 6565

    fun create(book: Book): Mono<Book> {

        val channel = getChannel()
        try {
            val stub = BookServiceGrpc.newBlockingStub(getChannel())
            val reqBuilder = BookOuterClass.CreateRequest.newBuilder()
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

    fun findAll(): Mono<List<Book>> {

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

            return Mono.just(res)
        } finally {
            channel.shutdown()
        }
    }

    private fun getChannel() = OkHttpChannelBuilder.forAddress(hostname, port)
            .usePlaintext(true)
            .build()
}
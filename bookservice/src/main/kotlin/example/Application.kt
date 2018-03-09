package example

import org.jetbrains.exposed.spring.SpringTransactionManager
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.context.annotation.Bean
import javax.sql.DataSource


@SpringBootApplication
class Application {
    @Bean
    fun transactionManager(dataSource: DataSource) = SpringTransactionManager(dataSource)
}

fun main(args: Array<String>) {
    runApplication<Application>(*args)
}

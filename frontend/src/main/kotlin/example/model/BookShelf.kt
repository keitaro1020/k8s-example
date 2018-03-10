package example.model

import reactor.core.publisher.Flux

data class BookShelf(
        val id: Long?,
        val title: String,
        val bookIds: List<Long> = emptyList(),
        val description: String,
        var books: List<Book> = emptyList()
)
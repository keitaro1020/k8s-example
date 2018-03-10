package example.model

data class BookShelf(
        val id: Long?,
        val title: String,
        val bookIds: List<Long>,
        val description: String
)
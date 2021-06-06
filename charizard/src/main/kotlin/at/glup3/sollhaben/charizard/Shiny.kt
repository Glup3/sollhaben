package at.glup3.sollhaben.charizard

import java.time.LocalDateTime
import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.Id

@Entity
class Shiny(
    var title: String,
    var description: String,
    var price: Float,
    var imageLocation: String,
    var publishedAt: LocalDateTime = LocalDateTime.now(),
    @Id @GeneratedValue var id: Long? = null
)

object Request {
    data class CreateShinyInput(var title: String, var description: String, var price: Float)
    data class PaginatedData<T>(var data: List<T>, var totalPages: Int, var totalElements: Long)
}
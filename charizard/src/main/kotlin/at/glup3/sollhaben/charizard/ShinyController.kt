package at.glup3.sollhaben.charizard

import org.springframework.data.domain.PageRequest
import org.springframework.validation.annotation.Validated
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController
import javax.validation.constraints.Min
import javax.ws.rs.QueryParam
import kotlin.random.Random

const val DEFAULT_PAGE = 0
const val DEFAULT_SIZE = 25

@RestController
@Validated
@RequestMapping("/api/v1/shiny")
class ShinyController(private val repository: ShinyRepository) {

    @GetMapping
    fun findAll(
        @QueryParam("page") @Min(0) page: Int?,
        @QueryParam("size") @Min(1) size: Int?
    ): Request.PaginatedData<Shiny> {
        val data = repository.findAll(PageRequest.of(page ?: DEFAULT_PAGE, size ?: DEFAULT_SIZE))

        return Request.PaginatedData<Shiny>(data.content, data.totalPages, data.totalElements)
    }

    @PostMapping("/seed")
    fun seed() {
        repository.deleteAll()
        repository.saveAll(List(500) {
            Shiny(
                title = "Charizard $it",
                description = "lorem ipsum",
                price = 5 + Random.nextFloat() * (40 - 5),
                imageLocation = "images/charizard_$it"
            )
        })
    }
}
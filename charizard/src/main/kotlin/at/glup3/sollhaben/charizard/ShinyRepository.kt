package at.glup3.sollhaben.charizard

import org.springframework.data.repository.PagingAndSortingRepository

interface ShinyRepository : PagingAndSortingRepository<Shiny, Long> {
    
}
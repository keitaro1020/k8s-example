package example.controller

import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController
import example.dao.BookShelfDao

@RestController
@RequestMapping("/api/health_check")
class HealthzController(val bookShelfDao: BookShelfDao) {

    @GetMapping("")
    fun healthz() = try {
        ResponseEntity.ok(true)
    } catch(e: Exception) {
        ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR)
    }

}
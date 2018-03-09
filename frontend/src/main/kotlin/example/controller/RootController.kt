package example.controller

import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.GetMapping

@Controller
class RootController {

    @GetMapping("/")
    fun index() = "index"
}
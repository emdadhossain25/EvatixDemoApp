package evatix.emdad.emdad.controller

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/api/hello")
class EvatixController {

    @GetMapping
    fun helloWorld()="hello world from controller"
}
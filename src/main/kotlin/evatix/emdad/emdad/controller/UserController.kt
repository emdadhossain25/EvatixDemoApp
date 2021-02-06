package evatix.emdad.emdad.controller

import evatix.emdad.emdad.model.User
import evatix.emdad.emdad.service.UserService
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/api/users")
class UserController(private val service:UserService) {

    @GetMapping
    fun getBanks():Collection<User> = service.getUsers()
}
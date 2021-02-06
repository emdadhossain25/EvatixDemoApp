package evatix.emdad.emdad.service

import evatix.emdad.emdad.datasource.UserDataSource
import evatix.emdad.emdad.model.User
import org.springframework.stereotype.Service

@Service
class UserService(private val userDataSource: UserDataSource) {
    fun getUsers(): Collection<User> = userDataSource.retrieveUsers()
}
package evatix.emdad.emdad.datasource.mock

import evatix.emdad.emdad.datasource.UserDataSource
import evatix.emdad.emdad.model.User
import org.springframework.stereotype.Repository


@Repository
class MockUserDataSource : UserDataSource {
    var users = listOf(User())
    override fun retrieveUsers(): Collection<User> {
        return users
    }
}
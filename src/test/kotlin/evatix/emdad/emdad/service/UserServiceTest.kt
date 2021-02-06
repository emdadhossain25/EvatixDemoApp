package evatix.emdad.emdad.service

import evatix.emdad.emdad.datasource.UserDataSource
import io.mockk.every
import io.mockk.mockk
import io.mockk.verify
import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

internal class UserServiceTest {
    private val userDataSource: UserDataSource = mockk(relaxed = true)
    private val userService: UserService = UserService(userDataSource)

    @Test
    fun ` should call its data source to retrive users`() {
        //when
        val users = userService.getUsers()
        verify(exactly = 1) { userDataSource.retrieveUsers() }
        //then

    }
}
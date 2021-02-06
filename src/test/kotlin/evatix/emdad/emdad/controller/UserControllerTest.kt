package evatix.emdad.emdad.controller

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc
import org.springframework.boot.test.context.SpringBootTest
import org.springframework.http.MediaType
import org.springframework.test.web.servlet.MockMvc
import org.springframework.test.web.servlet.get

//integration test loads up the whole application
@SpringBootTest
@AutoConfigureMockMvc
internal class UserControllerTest {
    //    allows to make requests to rest api without using any
    @Autowired
    lateinit var mockMvc: MockMvc

    @Test
    fun ` should return all users `() {
        //when/then
        mockMvc.get("/api/users")
            .andDo { print() }
            .andExpect {
                status { isOk() }
                content { contentType(MediaType.APPLICATION_JSON) }
                jsonPath("$[0].userID") { value(-1) }
            }


    }
}
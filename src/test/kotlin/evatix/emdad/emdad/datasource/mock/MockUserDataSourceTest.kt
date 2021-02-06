package evatix.emdad.emdad.datasource.mock


import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class MockUserDataSourceTest{
    private var mockUserDataSource: MockUserDataSource = MockUserDataSource()

    @Test
    fun ` should return the Users list `(){
    //given
    
    
    //when
    val users= mockUserDataSource.retrieveUsers()
    
    //then
    assertThat(users).isNotEmpty()
    }
    
}
package evatix.emdad.emdad.datasource

import evatix.emdad.emdad.model.User

interface UserDataSource {

    fun retrieveUsers():Collection<User>
}
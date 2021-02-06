package evatix.emdad.emdad.model

data class User(

    val UserID:Int=-1,
    val UserName:String?="",
    val Email:String="",
    val PassWordHash:String="",
    val CreatedAt:Long=0L,
    val IsActive:Int=0,

)

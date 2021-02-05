package evatix.emdad.emdad.model

data class Task(
    val TaskID:Int=0,
    val TaskTitle:String?="",
    val StartAt:Long?=0L,
    val EndAt:Long?=0L,
    val Dated:Long?=0L,
    val IsWholeDay:Int=0,
    val IsCompleted:Int=0,
    val CompletedAt:Long?=0L,
    val Description:String?="",
    val UserID:Int=0,
)

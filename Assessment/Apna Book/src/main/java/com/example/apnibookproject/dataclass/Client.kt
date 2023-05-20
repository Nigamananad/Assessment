package com.example.apnibookproject.dataclass

//import androidx.room.Entity
//import androidx.room.PrimaryKey

//@Entity(tableName="client-table")
data class Client(
//    @PrimaryKey()
    val id:Int=0,
    var name:String,
    var contact:String
)

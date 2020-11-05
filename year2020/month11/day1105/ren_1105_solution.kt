package week19

import java.util.*


fun main(): Unit = with(Scanner(System.`in`)) {
    val N =  arrayListOf<String>()
    for(i in 0 until 5){
        N.add(next())
    }
    var M = N.reversed()
    for(i in 0 until 5){
        println(M[i])
    }



}
package week19

import java.util.*


fun main(): Unit = with(Scanner(System.`in`)) {
    var N = nextLine()
    val M = N.split(" ")
    for(i in 0..(M.size-1)){
        println("${i+1}. ${M[i]}")
    }


}
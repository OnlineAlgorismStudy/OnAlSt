package week19

import java.util.*


fun main(): Unit = with(Scanner(System.`in`)) {
    val N = next()
    val M = next()
    if(N.length > M.length){
        print(N.length)
    }else{
        print(M.length)
    }
}
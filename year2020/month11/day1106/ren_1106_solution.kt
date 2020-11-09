package week19

import java.util.*


fun main(): Unit = with(Scanner(System.`in`)) {
    val N =  nextLine()

    var M = N.split(' ')
    for(i in 0..M.size -1){
        if(i % 2 == 0){
            println(M[i])
        }

    }


}
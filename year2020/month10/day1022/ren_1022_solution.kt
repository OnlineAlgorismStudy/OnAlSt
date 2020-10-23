package week17

import java.util.*


fun main(): Unit = with(Scanner(System.`in`)) {
    val N = next()
    val M = nextInt()

    if(N.length > M){
        for(i in (M-1)..(N.length - 1)) print(N[i])
    }else{
        print(N)
    }


}
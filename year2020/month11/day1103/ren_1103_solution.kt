package week19

import java.util.*


fun main(): Unit = with(Scanner(System.`in`)) {
    var N = next()
    while(true){
        val M = nextInt()
        if(N.length == 1){
            return;
        }
        if(N.length  <= M){
            N = N.substring(0..N.length-2)
        }else{
            N = N.substring(0..(M-1)-1) + N.substring(M)
        }

        println(N)
    }


}
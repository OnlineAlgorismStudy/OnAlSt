package week6

import java.util.*

fun main() = with(Scanner(System.`in`)) {
    var max = Int.MAX_VALUE
    val buff = IntArray(10);
    for(i in 0..9){
        val input = nextInt()
        print(i)
        buff[i] = input;
        if(input < max){
            max = input
        }
    }
    println(max)
//    for(i in 0..9){
//        print("${buff[i]} ")
//    }
//    println()
    
}
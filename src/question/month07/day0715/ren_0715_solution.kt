package week3

import java.util.*

fun main(args: Array<String>) = with(Scanner(System.`in`)) {
    val num = nextInt()
    for(i in num downTo 1){
        println("*".repeat(i))
    }
    for(i in  1..num){
        println("*".repeat(i))
    }
}
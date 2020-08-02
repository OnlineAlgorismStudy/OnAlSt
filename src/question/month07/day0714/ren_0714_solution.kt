package week3

import java.util.*

fun main(args: Array<String>) = with(Scanner(System.`in`)) {
    val num = nextInt()
    for(i in 1..num){
        println("*".repeat(i))
    }
}
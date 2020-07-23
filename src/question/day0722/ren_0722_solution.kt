package week4

import java.util.*

fun main() = with(Scanner(System.`in`)) {
    val input: Int = nextInt()
    for(i in 1..input){
        println("*".repeat(i))
    }
    for(i in input -1 downTo 1){
        println("*".repeat(i))
    }
}
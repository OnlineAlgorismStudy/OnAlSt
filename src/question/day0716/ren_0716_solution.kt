package week3

import java.util.*

fun main(args: Array<String>) = with(Scanner(System.`in`)) {
    val num = nextInt()
    for(i in num downTo 1){
        println("${" ".repeat(num-i)}${"*".repeat(i)}")
    }
}
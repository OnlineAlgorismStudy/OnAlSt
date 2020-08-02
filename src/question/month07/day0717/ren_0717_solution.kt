package week3

import java.util.*

fun main() = with(Scanner(System.`in`)) {
    val num = nextInt()
    for (i in 0 until num) {
        for (j in 0 until i) print(" ")
        for (j in 0 until ((num - i) * 2) - 1) print("*")
        println()
    }
}
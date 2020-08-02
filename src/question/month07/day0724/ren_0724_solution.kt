package week4

import java.util.*

fun main() = with(Scanner(System.`in`)) {
    val input: Int = nextInt()
    for (i in 1..input) {
        for (j in i until input * 2 - i) {
            print(" ")
        }
        for (j in 0 until 2 * i - 1) {
            print("*")
        }
        println()
    }
}
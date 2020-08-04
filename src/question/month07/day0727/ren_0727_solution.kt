package week5

import java.util.*

fun main() = with(Scanner(System.`in`)) {
    val input: Int = nextInt()
    for (i in 1..input) {
        for (j in i until (input * 2) - i) {
            print(" ")
        }
        for (j in 1..i) {
            print("$j ")
        }
        println()
    }
}
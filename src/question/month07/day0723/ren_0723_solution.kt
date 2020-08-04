package week4

import java.util.*

fun main() = with(Scanner(System.`in`)) {
    val input: Int = nextInt()
    for (i in 0 until input) {
        for (j in 0 until i) {
            print(" ")
        }
        for (j in 0 until (input - i) * 2 - 1) {
            print("*")
        }
        println()
    }


    for (i in 1 until input) {
        for (j in input - 1 downTo i + 1) {
            print(" ")
        }
        for (j in 0 until i * 2 + 1) {
            print("*")
        }
        println()
    }

}
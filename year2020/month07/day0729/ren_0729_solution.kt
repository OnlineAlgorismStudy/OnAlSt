package week5

import java.util.*

fun main() = with(Scanner(System.`in`)) {
    val input: Int = nextInt()

    for (i in 1..input) {
       println("# ".repeat(i))
    }
    for (i in 1 until input) {
        for (j in 1..i) {
            print("  ")
        }
        for (j in 1..input - i) {
            print("# ")
        }
        println()
    }
}
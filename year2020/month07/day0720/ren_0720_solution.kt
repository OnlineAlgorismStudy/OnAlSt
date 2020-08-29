package week3

import java.util.*

fun main() = with(Scanner(System.`in`)) {
    val input = nextInt()
    var start : Char = 'A'
    if (3 > input || input > 10) return
    for (i in 0 until input) {
        for (j in 0 until input - i) {
           print(start++)
        }
        println()
    }
}
package week4

import java.util.*

fun main() = with(Scanner(System.`in`)) {
    val input: Int = nextInt()
    var num = 1
    var char = 'A'

    for (i in 0 until input) {
        for (j in 0 until input - i) {
            print("$num ")
            num++
        }
        for (k in 0..i) {
            print("$char ")
            char++
        }
        println()
    }
}
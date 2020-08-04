package week5

import java.util.*

fun main() = with(Scanner(System.`in`)) {
    val input: Int = nextInt()
    var cnt = 1
    for (i in 0 until input) {
        for (j in 0 until i) {
            print("  ")
        }
        for (j in i until input) {
            print("$cnt ")
            cnt++
        }
        println("")
    }
}
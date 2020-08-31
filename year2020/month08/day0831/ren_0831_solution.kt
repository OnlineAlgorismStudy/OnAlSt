package week10

import java.util.*


fun main() = with(Scanner(System.`in`)) {

    val arr = Array(3) { CharArray(5) }

    for (i in 0..2) {
        var input: Char
        for (j in 0..4) {
            input = next().single()
            arr[i][j] = input
        }
    }
    for (i in 0..2) {
        for (j in 0..4) {
            print("${arr[i][j].toLowerCase()} ")
        }
        println()
    }

}
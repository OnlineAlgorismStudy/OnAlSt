package week8

import java.util.*

fun main() = with(Scanner(System.`in`)) {
    val size = 26
    val arr = IntArray(size)
    while (true) {
        val input = next().single()
        if (input in 'A'..'Z') {
            arr[(input - 65).toInt()]++
        } else {
            break;
        }
    }
    for (i in 0 until 26) {
        if (arr[i] != 0) {
            println("${(i + 65).toChar()} : ${arr[i]}")
        }
    }
}
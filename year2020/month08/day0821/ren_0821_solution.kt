package week8

import java.util.*

fun main() = with(Scanner(System.`in`)) {
    val buff0 = Array(2) { IntArray(4) }
    val buff1 = Array(2) { IntArray(4) }
    val result = Array(2) { IntArray(4) }
    println("first array")
    for (i in 0..1) {
        for (j in 0..3) {
            buff0[i][j] = nextInt()
        }
    }

    println("second array")
    for (i in 0..1) {
        for (j in 0..3) {
            buff1[i][j] = nextInt()
        }
    }

    for (i in 0..1) {
        for (j in 0..3) {
            result[i][j] = buff0[i][j] * buff1[i][j]
            print("${result[i][j]} ")
        }
        println()
    }


}
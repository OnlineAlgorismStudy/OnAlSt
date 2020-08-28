package week9

import java.util.*

fun main() = with(Scanner(System.`in`)) {

    val arr = Array(4) { IntArray(2) }

    for (i in 0..3) {
        for (j in 0..1) {
            val input = nextInt()
            arr[i][j] = input
        }
    }
    var totalSum = 0
    var lSum = 0
    var rSum = 0
    for (i in 0..3) {
        var sum = 0
        for (j in 0..1) {
            val v = arr[i][j]
            sum += v
            totalSum += v
            if (j == 0) {
                lSum += v
            } else {
                rSum += v
            }
        }
        print("${sum / 2} ")
    }
    println()
    println("${lSum / 4} ${rSum / 4}")
    println(totalSum / 8)

}
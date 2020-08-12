package week7

import java.util.*

fun main() = with(Scanner(System.`in`)) {
    val a = IntArray(10)
    var evenSum = 0;
    var oddSum = 0;
    for (i in 0 until 10) {
        a[i] = nextInt()
        if ((i % 2) == 0) {
            oddSum += a[i]
        } else {
            evenSum += a[i]
        }
    }
    println("odd : $oddSum")
    println("even : $evenSum")
}
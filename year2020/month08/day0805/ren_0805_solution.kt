package week6

import java.util.*

fun main() = with(Scanner(System.`in`)) {
    val score = doubleArrayOf(85.6, 79.5, 83.1, 80.0, 78.2, 75.0)
    var input = nextInt()
    if(input > 6) return@with
    val v1 = score[input-1]
    input = nextInt()
    if(input > 6) return@with
    val v2 = score[input-1]
    println(((v1+v2) * 10) / 10)
}
package week2

import java.util.*
import kotlin.collections.ArrayList

fun main() {

    val sc: Scanner = Scanner(System.`in`)
    val numSize = sc.nextInt()

    if (numSize > 10) return;

    val score = ArrayList<Int>(numSize)

    for (i in 0 until numSize) {
        val input = sc.nextInt()
        score.add(input)
    }

    val avg = score.average()
    println("avg : $avg")

    if (avg > 80.0) print("pass") else print("fail")

}

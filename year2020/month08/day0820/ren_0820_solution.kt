package week8

import java.util.*

fun main() {
    val arr1 = arrayOf(
            arrayOf<Int>(5, 8, 10, 6, 4),
            arrayOf<Int>(11, 20, 1, 13, 2),
            arrayOf<Int>(7, 9, 14, 22, 3),
            )

    for(i in arr1){
        for(j in i){
            print(String.format("%2d", j))
            print(" ".repeat(3))
        }
        println()
    }
}
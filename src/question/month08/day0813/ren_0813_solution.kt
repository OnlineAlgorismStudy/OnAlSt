package week7

import java.util.*
/*
 45 19 123 58 10 -55 16 -1 999 -출력 예 max : 123 min : -55
 */
fun main() = with(Scanner(System.`in`)) {
    val bufferSize = 100
    val a = IntArray(bufferSize)
    var min : Int = 0
    var max : Int = 0
    for (i in a.indices) {
        val input = nextInt()
        if(input == 999) {
            for (j in 1..a.lastIndex) {
                val e = a[j]
                if (max < e) max = e
            }
            for (j in 1..a.lastIndex) {
                val e = a[j]
                if (min > e) min = e
            }
            println("max : ${max}")
            println("min : ${min}")
            return
        }
        a[i] = input
    }
}
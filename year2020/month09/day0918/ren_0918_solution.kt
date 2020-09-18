package week12

import java.util.*


fun main() = with(Scanner(System.`in`)) {

    fun solution(v1: Int, v2: Int): Int {
        val a = v1 * v1
        val b = v2 * v2
        return if (a > b) {
            v1
        } else {
            v2
        }
    }

    fun solution2(v1: Float, v2: Float): Float {
        val a = v1 * v1
        val b = v2 * v2
        return if (a > b) {
            v2
        } else {
            v1
        }
    }


    val a: Int = nextInt()
    val b: Int = nextInt()
    val c: Float = nextFloat()
    val d: Float = nextFloat()

    val result = solution(a, b)
    val result2 = solution2(c, d)
    println(result)
    println(result2)
}
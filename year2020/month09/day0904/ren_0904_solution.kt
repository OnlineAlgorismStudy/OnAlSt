package week10

import java.util.*


fun main(){

    fun solution(a: Int, b: Int, c: Int): Int? {
        val vArray = IntArray(3)
        vArray[0] = a
        vArray[1] = b
        vArray[2] = c
        return vArray.maxOrNull()
    }

    val result = solution(-10, 115, 33)
    print(result)
}
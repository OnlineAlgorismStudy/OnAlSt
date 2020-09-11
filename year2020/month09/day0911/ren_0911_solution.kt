package week11

import java.util.*
import kotlin.math.pow


fun main() {

    fun solution(v: Int): Int? {
        if(v > 1000 ) return null
        var num = 0
        for (i in 0..v) {
            num += i
        }
        return num
    }
    val result = solution(100)
    print(result)

}
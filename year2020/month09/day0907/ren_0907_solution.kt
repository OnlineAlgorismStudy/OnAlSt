package week11

import java.util.*
import kotlin.math.pow


fun main(){

    fun solution(a: Int, b: Int): Int? {
        var sum = 1
        for (i in 1..b){
            sum *= a
        }
        return sum
    }

    val result = solution(2, 4)
    print(result)
}
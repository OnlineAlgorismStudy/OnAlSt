package week11

import java.util.*
import kotlin.math.pow


fun main(){

    fun solution(a: Int, b: Int): Pair<Int, Int> {
        var x = 0
        var y = 0
        if(a > b){
            x = a / 2
            y = b * 2
        }else{
            x = a * 2
            y = b / 2
        }
        return Pair(x, y)
    }

    val result = solution(100, 500)
    print("${result.first} ${result.second}")
}
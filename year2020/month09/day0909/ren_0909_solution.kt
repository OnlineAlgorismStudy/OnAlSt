package week11

import java.util.*
import kotlin.math.pow


fun main(){

    fun solution(a: Int, b: Int){
        val range = b - a
        var v = a
        for(i in 0..range){
            println("== ${v}dan ==")
            for(j in 1..9){
                println("$v * $j = ${v*j}")
            }
            println()
            v++
        }
    }

    val result = solution(3, 5)

}
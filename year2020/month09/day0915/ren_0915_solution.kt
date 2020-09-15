package week12

import java.util.*


fun main()= with(Scanner(System.`in`)) {

    fun solution(v1: Int, v2:Int): Int? {
        if(v1 < 0 || v2 < 0) return 0
        return if(v1 > v2){
            (Math.pow(v1.toDouble(), 2.0) - Math.pow(v2.toDouble(), 2.0)).toInt()
        }else{
            (Math.pow(v2.toDouble(), 2.0) - Math.pow(v1.toDouble(), 2.0)).toInt()
        }
    }
    val a = nextInt()
    val b = nextInt()
    println(solution(a, b))
}
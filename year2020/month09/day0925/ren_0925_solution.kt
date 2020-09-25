package week13

import java.util.*


fun main() = with(Scanner(System.`in`)) {

    val num1: Int = nextInt()
    if(num1 in 21..0){
        return
    }
    fun solution(n : Int) : Int{
        return Math.pow(2.toDouble(), n.toDouble()).toInt()
    }
    print(solution(num1));

}
package week15

import java.util.*


fun main() = with(Scanner(System.`in`)) {

    val num1: Int = nextInt()
    if(num1  < 1 && num1 > 50){
        return
    }

    fun solution(n : Int) : Int{
        return if (n == 1) 1
        else {
            val nthNum = solution(n/2) + solution(n-1)
            nthNum
        }
    }
    print(solution(num1))

}
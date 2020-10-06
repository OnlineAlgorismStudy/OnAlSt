package week15

import java.util.*


fun main() = with(Scanner(System.`in`)) {

    var num1: Int = nextInt()
    if(num1  < 1 && num1 > 100){
        return
    }

    fun solution(n : Int) : Int{
       if(n == 0) return 0
        else
           return n + solution(n - 1)
    }
    print(solution(num1))

}
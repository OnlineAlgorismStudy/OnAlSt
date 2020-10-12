package week15

import java.util.*


fun main(): Unit = with(Scanner(System.`in`)) {

    val num1: Int = nextInt()

    fun solution(n : Int){
        if (n<=0) return
        solution(n - 2)
        print("$n ")
    }

    solution(num1)

}
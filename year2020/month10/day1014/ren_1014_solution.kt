package week16

import java.util.*


fun main(): Unit = with(Scanner(System.`in`)) {

    var result = 0
    val N = nextInt()

    fun solution(n: Int): Int {
        if (n == 1)
            return result
        if (n % 2 == 0){
            result++
            return solution(n / 2)
        }else{
            result++
            return solution(n / 3)
        }
    }

    print(solution(N))

}
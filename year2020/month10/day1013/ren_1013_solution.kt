package week16

import java.util.*


fun main(): Unit = with(Scanner(System.`in`)) {


    val N = nextInt()

    fun solution(n: Int): Int {
        if (n == 2)
            return 2
        if (n == 1)
            return 1

        return (solution(n - 1) * solution(n - 2)) % 100
    }

    print(solution(N))

}
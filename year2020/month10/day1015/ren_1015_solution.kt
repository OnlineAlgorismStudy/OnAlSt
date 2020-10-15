package week16

import java.util.*


fun main(): Unit = with(Scanner(System.`in`)) {

    var result = 0
    val x = nextInt()
    val y = nextInt()
    val z = nextInt()

    fun solution(n: Int): Int {
        if(n == 0) return 1
        var g = 1
        g = n % 10
        if(g == 0)
            g = 1

        return (g * solution(n / 10))

    }

    print(solution(x*y*z))

}
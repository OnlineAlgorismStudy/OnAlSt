package week16

import java.util.*


fun main(): Unit = with(Scanner(System.`in`)) {

    var loc = 1
    var dice = IntArray(11)
    val N = nextInt()
    fun solution(n: Int): Unit {
        for (i in dice[loc - 1]..6) {
            dice[loc] = i
            if (loc == N) {
                for (j in 1..N) {
                    print("${dice[j]} ")
                }
                println()
            } else {
                loc++
                solution(N)
                loc--
            }
        }
    }
    dice[0] = 1
    print(solution(N))

}
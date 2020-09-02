package week10

import java.util.*


fun main() = with(Scanner(System.`in`)) {
    fun solution(round: Int): Double {
        val s = 0.0
        return round * round * 3.14
    }

    val cnt = nextInt()
    if (cnt < 0) return
    print(String.format("%.2f", solution(cnt)))
}
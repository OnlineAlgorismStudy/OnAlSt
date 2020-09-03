package week10

import java.util.*


fun main() = with(Scanner(System.`in`)) {
    fun solution(num: Int) {
        var cnt = 0
        for (i in 0 until num) {
            for (j in 0 until num) {
                print("${++cnt} ")
            }
            println()
        }
    }

    val cnt = nextInt()
    if (cnt < 0) return
    if (cnt > 100) return
    solution(cnt)
}
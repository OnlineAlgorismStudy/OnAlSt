package week5

import java.util.*

fun main() = with(Scanner(System.`in`)) {
    var s: Int
    var e: Int
    while (true) {
        s = nextInt()
        e = nextInt()
        if (s < 2 || 9 < s || e < 2 || 9 < e) {
            println("INPUT ERROR!")
        } else break
    }
    if (s < e) {
        for (j in 1..9) {
            for (i in s..e) {
                val text: String = String.format("%d * %d = %2d   ", i, j, i * j)
                print(text);
            }
            println()
        }
    } else {
        for (j in 1..9) {
            for (i in s downTo e) {
                val text: String = String.format("%d * %d = %2d   ", i, j, i * j)
                print(text);
            }
            println()
        }
    }
    close()
}
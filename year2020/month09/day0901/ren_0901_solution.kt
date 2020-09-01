package week10

import java.util.*


fun main() = with(Scanner(System.`in`)) {


    fun printMethod(loopCnt: Int) {
        for (i in 0 until loopCnt) {
            println("~!@#\\\$^&*()_+|")
        }
    }

    val cnt = nextInt()
    if (cnt < 0) return;
    printMethod(cnt)
}
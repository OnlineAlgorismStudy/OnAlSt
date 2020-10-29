package week18

import java.util.*


fun main(): Unit = with(Scanner(System.`in`)) {
    val N = nextLine()
    val s = StringBuffer(N)

    for (i in N.indices) {
        s.insert(0, s[N.length - 1])
        s.deleteCharAt(s.length - 1)
        println(s)
    }
}
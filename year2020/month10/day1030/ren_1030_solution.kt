package week18

import java.util.*


fun main(): Unit = with(Scanner(System.`in`)) {
    val N = nextLine()
    println(N.replace("[^a-zA-Z0-9]".toRegex(), "").toLowerCase())
}
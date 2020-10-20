package week17

import java.util.*


fun main(): Unit = with(Scanner(System.`in`)) {
    val N = next()
    if(N.length > 100) return
    print(N.repeat(2))
}
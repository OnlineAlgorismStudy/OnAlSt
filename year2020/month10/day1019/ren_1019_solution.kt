package week17

import java.util.*


fun main(): Unit = with(Scanner(System.`in`)) {
    while (true) {
        print("ASCII code =? ")
        val N = nextInt()
        println(N.toChar())
        if (!(N in 33..127)) {
            return
        }
    }
}
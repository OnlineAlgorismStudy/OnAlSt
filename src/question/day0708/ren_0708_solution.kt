package week2

import java.util.*

fun main() {
    val cityList = listOf<String>("1. Korea", "2. USA", "3. Japan", "4. China")
    val sc: Scanner = Scanner(System.`in`)

    while (true) {
        cityList.forEach { it ->
            println(it)
        }
        print("number? ")
        val input: Int = sc.nextInt() ?: return
//        if (input < 0 || input > 4) return
        println()
        when (input) {
            1 -> println("Seoul")
            2 -> println("Washington")
            3 -> println("Tokyo")
            4 -> println("Beijing")
            else -> println("none")
        }
        println()
    }
}
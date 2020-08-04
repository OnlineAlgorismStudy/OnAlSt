package week6

import java.util.*

fun main() = with(Scanner(System.`in`)) {
    val input: String = nextLine()
    val array = input.split(" ")
    print("${array[0]} ${array[3]} ${array[6]}")
}
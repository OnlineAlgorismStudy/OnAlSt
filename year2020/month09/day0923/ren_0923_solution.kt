package week13

import java.util.*


fun main() = with(Scanner(System.`in`)) {

    var num1: Double = nextDouble()
    var num2: Double = nextDouble()

    num1 = Math.sqrt(num1)
    num2 = Math.sqrt(num2)

    print(Math.abs(num1 - num2).toInt())
}
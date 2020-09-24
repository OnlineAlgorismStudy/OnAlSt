package week13

import java.util.*


fun main() = with(Scanner(System.`in`)) {

    var num1: Int = nextInt()
    var num2: Int = nextInt()
    var num3: Int = nextInt()
    var num4: Int = nextInt()
    var num5: Int = nextInt()


    println("${Math.abs(num1) + Math.abs(num2) + Math.abs(num3) + Math.abs(num4) + Math.abs(num5)}")

}
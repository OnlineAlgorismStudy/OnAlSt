package week20

import java.util.*


fun main(): Unit = with(Scanner(System.`in`)) {
    var input1: String = next()
    var input2: String = next()
    while (input1.length < 2 || input1.length > 20) input1 = next()
    while (input2.length < 2 || input2.length > 20) input2 = next()

    val substrInput1 = input1.substring(0, 2)
    val sb = StringBuffer(input2)
    println(sb.replace(0, 2, substrInput1).append(substrInput1))
}
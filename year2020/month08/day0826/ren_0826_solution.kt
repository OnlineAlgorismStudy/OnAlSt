package week9

import java.util.*

fun main() = with(Scanner(System.`in`)) {

    val student = Array(4) { IntArray(3) }

    for (i in student.indices) {
        print((i + 1).toString() + "class? ")
        for (j in student[i].indices) {
            student[i][j] = nextInt()
        }
    }

    for (i in student.indices) {
        var sum = 0
        print((i + 1).toString() + "class : ")
        for (element in student[i]) {
            sum += element
        }
        println(sum)
    }

}
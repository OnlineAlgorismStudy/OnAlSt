package week13

import java.util.*

inline fun solutionOne(a : Int, b: Int)  = (a-b) * (a-b)
inline fun solutionTwo(a : Int, b: Int)  = (a + b) * (a + b) * (a + b)

fun main() = with(Scanner(System.`in`)) {

    val i1 = nextInt()
    val i2 = nextInt()
    print("($i1 - $i2) ^ 2 = ")
    println(solutionOne(i1, i2))
    print("($i1 + $i2) ^ 3 = ")
    println(solutionTwo(i1, i2))


}
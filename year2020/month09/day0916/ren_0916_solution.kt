package week12

import java.util.*


fun main() = with(Scanner(System.`in`)) {

    val arr = Array<IntArray>(3) { IntArray(3) }
    val arr2 = IntArray(3)

    fun solution(v1: IntArray, v2 : Int) {
        for (i in v1.indices) {
            print("${v1[i]} ")
        }
        println(v1.sum())
        arr2[v2] = v1.sum()
    }
    fun colSum(col: Int) = arr.sumBy {row -> row[col] }

    for (i in 0 until 3) {
        for (j in 0 until 3) {
            arr[i][j] = nextInt()
        }
    }

    for (i in 0 until 3) {
        solution(arr[i], i)
    }
    for (i in 0 until 3) {
        print("${colSum(i)} ")
    }
    print(arr2.sum())

}
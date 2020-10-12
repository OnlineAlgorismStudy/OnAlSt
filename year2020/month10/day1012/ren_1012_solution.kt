package week16

import java.util.*


fun main(): Unit = with(Scanner(System.`in`)) {


    var N = 0
    var M = 0
    N = nextInt()
    M = nextInt()
    val arr = IntArray(N)

    fun solution(level: Int, sum: Int){
        if (level < arr.size) {
            for (i in 1..6) {
                arr[level] = i
                solution(level + 1, sum + i)
            }
        } else {
            if (sum == M) {
                for (j in 0 until arr.size) {
                    print(arr.get(j).toString() + " ")
                }
                println("")
            }
        }
    }

    solution(0,0)

}
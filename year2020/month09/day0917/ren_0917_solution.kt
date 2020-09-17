package week12

import java.util.*


fun main() = with(Scanner(System.`in`)) {

    fun solution(v1: IntArray) {
        var comp = 0

        for (i in v1.indices) {
            for (j in v1.indices) {
                if (v1[i] > v1[j]) {
                    comp = v1[i]
                    v1[i] = v1[j]
                    v1[j] = comp
                }
            }
        }
        for (i in v1.indices) {
            print(v1[i].toString() + " ")
        }

    }

    val cnt = nextInt()
    val valueArray = IntArray(cnt)
    for (i in 0 until cnt) {
        valueArray[i] = nextInt()
    }
    solution(valueArray)
}
package week7

import java.util.*


fun main() = with(Scanner(System.`in`)) {
    val iList = IntArray(10)
    for (i in iList.indices) {
        iList[i] = nextInt()
    }
    for (i in iList.indices) {
        for (j in i + 1 until iList.size) {
            if (iList[i] < iList[j]) {
                val tmp: Int = iList[i]
                iList[i] = iList[j]
                iList[j] = tmp
            }
        }
    }
    for (element in iList) {
        print("$element ")
    }
}
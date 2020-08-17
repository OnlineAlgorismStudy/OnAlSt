package week8

import java.util.*

fun main() = with(Scanner(System.`in`)) {
    val bufferSize = 100
    val a = IntArray(bufferSize)
    var sum: Int = 0
    var avg: Float = 0.0f
    var cnt: Int = 0
    var loopCnt = 0
    for (i in a.indices) {
        val input = nextInt()
        if (input == 0) {
            break;
        }
        a[i] = input;
        loopCnt++
    }
    for (i in 0 until loopCnt) {
        if(a[i] % 2 == 0){
            print("${a[i] / 2} ")
        }else{
            print("${a[i] * 2} ")
        }
    }

}
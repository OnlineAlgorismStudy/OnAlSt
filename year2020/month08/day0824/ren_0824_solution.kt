package week9

import java.util.*

/**
 * 85 67 95 65
80 95 86 56
100 98 67 86
95 76 84 65
67 86 90 76
 */
fun main() = with(Scanner(System.`in`)) {
    val buff0 = Array(5) { IntArray(4) }
    val result = arrayOfNulls<String>(5)
    var count = 0
    for (i in 0..4) {
        for (j in 0..3) {
            buff0[i][j] = nextInt()
        }
    }

    for (i in 0..4) {
        var sum = 0;
        for (j in 0..3) {
            sum += buff0[i][j]
        }
        val avg = sum / 4
        if(avg >= 80 ){
            result[i] = "pass"
            count++
        }else{
            result[i] = "fail"
        }
    }

    for(i in 0 until 5){
        println(result[i])
    }
    println("Successful : $count")


}
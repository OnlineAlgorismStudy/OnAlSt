package week5

import java.util.*

fun main() = with(Scanner(System.`in`)) {
    val input: Int = nextInt()
    var cnt: Int = 1
    for (i in 0 until input) {
        for(j in 0 until input){
            if(cnt > 10) cnt = 1;
            print("$cnt ")
            cnt += 2;
        }
        println()
    }
}
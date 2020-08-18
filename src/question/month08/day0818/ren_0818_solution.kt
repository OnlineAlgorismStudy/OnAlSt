package week8

import java.util.*

fun main() = with(Scanner(System.`in`)) {

    val size = nextInt()
    if(size > 20) return
    val score = IntArray(size)

    for(i in 0 until  size){
        val input = nextInt()
        score[i] = input
    }

    for(i in 0 until size){
        for(j in (i+1) until size){
            if(score[j] > score[i] ){
                val tmp = score[i]
                score[i] = score[j]
                score[j] = tmp
            }
        }
    }

    for(i in 0 until  size){
        println(score[i])
    }

}
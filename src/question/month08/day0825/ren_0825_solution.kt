package week9

import java.util.*

fun main() = with(Scanner(System.`in`)) {
    val arraySize = 100
    val scores = IntArray(arraySize)
    val result = IntArray(11)
    var count = 0
    for(i in 0 .. arraySize){
        val input =  nextInt()
        if(input != 0){
            scores[i] = input
            count++;
        }else {
            break;
        }
    }

    for(i in 0 until count){
        result[scores[i] /10] ++
    }
    for(i in 10 downTo 0){
        if(result[i] != 0){
            println("${i * 10} : ${result[i]} person")
        }

    }




}
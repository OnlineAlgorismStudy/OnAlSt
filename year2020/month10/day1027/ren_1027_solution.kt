package week18

import java.util.*


fun main(): Unit = with(Scanner(System.`in`)) {
    val N = next()
    for(element in N){
        if(element >= 'A' && element <= 'Z'){
            print(element.toUpperCase())
        }
        else if(element >= 'a' && element <= 'z') {
            print(element.toUpperCase())
        }
    }
}
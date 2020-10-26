package week18

import java.util.*


fun main(): Unit = with(Scanner(System.`in`)) {
    while (true){
        val N = next().toCharArray()
        if(N[0] >= '0' && N[0] <= '9'){
            println(N[0].toInt())

        }else if(N[0] >= 'A' && N[0] <= 'Z'){
            println(N[0])
        }
        else if(N[0] >= 'a' && N[0] <= 'z'){
            println(N[0])
        }else{
            return;
        }
    }
}
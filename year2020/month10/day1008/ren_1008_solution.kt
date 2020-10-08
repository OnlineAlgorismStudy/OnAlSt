package week15

import java.util.*


fun main() = with(Scanner(System.`in`)) {

    val num1: Int = nextInt()
    var out = 0;
    if(num1  < 1){
        return
    }

    fun solution(n : Int) : Unit{
        if(n < 1){
            return;
        }else {
            out = n/2
            solution(out)
            print( "$n ")
        }
    }
    solution(num1)

}
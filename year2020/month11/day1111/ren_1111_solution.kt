package week20

import java.util.*


fun main(): Unit = with(Scanner(System.`in`)) {
    var n: String = next()
    if(n.contains('c')){
        print("YES ")
    }else{
        print("NO ")
    }
    if(n.contains("ab")){
        print("YES ")
    }else{
        print("NO ")
    }
}
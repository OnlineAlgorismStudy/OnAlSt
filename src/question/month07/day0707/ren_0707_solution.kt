package week2

import java.util.*

fun main() {

    val sc: Scanner = Scanner(System.`in`)
    print("Number? ")
    val input: Int = sc.nextInt() ?: return

    if(input > 3) {
        println("I don't know.");
        return;
    }

    when(input){
        1 -> print("dog")
        2 -> print("cat")
        3 -> print("chick")
    }
}
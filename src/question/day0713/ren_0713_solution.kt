package week3

import java.util.*
import kotlin.collections.ArrayList

fun main() {
    for(i in 2..4){
        for(j in 1..5){
            print("$i * $j =${String.format("%3d",i*j)}")
            print(" ".repeat(3))
        }
        println()
    }
}

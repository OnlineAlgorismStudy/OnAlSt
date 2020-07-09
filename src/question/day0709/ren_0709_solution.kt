package week2

import java.util.*

fun main() {

    val sc: Scanner = Scanner(System.`in`)

    while (true) {
        print("Base = ")
        val base: Int = sc.nextInt()
        print("Height = ")
        val height: Int = sc.nextInt()
        val width = (base * height) / 2.0f
        println("Triangle width = $width")
        var char: CharArray
        while (true) {
            print("Continue? ")
            val continues = sc.next()
            char = continues.toCharArray()
            if (char.size in 0..1) break else continue
        }
        val code = char.get(0).toInt()
        if (!((0x79.equals(code)) or (0x59.equals(code)))) {
            return
        }
    }
}

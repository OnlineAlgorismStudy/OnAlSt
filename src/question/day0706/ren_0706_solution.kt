package week2

import java.util.*

fun main() {
    fun calc(foo: Int): Boolean {
        if (foo % 400 == 0x00 || (foo % 4 == 0x00 && foo % 100 != 0x00)) return true;
        return false;
    }

    val sc: Scanner = Scanner(System.`in`)
    val input: Int = sc.nextInt() ?: return

    if (input < 1900) return;

    if (calc(input))
        println("leap year")
    else
        println("common year")
}
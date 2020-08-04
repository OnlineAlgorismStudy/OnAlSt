package week6

import java.util.*

fun main() = with(Scanner(System.`in`)) {
    val BUF_MAX_SIZE = 100
    var idx = 0
    val buff = Array<Int>(BUF_MAX_SIZE){0}
    for(i in 0 until BUF_MAX_SIZE){
        val value = nextInt()
        if (0.equals(value)){
            idx = i
            break
        }
        if (buff.size > BUF_MAX_SIZE) break
        buff[i] = value;
    }
    val filterBuff = buff.copyOfRange(0, idx)
    filterBuff.reverse();
    for(i in filterBuff){
        print("$i ")
    }
}
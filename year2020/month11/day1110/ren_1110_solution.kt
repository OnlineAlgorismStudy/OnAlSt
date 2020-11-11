package week20

import java.util.*


fun main(): Unit = with(Scanner(System.`in`)) {
    var n: String = next()
    var m: String = next()
    while (n.length < 2 || n.length > 20) n = next()
    while (m.length < 2 || m.length > 20) m = next()

    val r = n.substring(0, 2)
    val sb = StringBuffer(m)
    println(sb.replace(0, 2, r).append(r))
}
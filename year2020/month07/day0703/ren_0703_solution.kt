import java.util.*

fun main() {
    val sc: Scanner = Scanner(System.`in`)
    val input = sc.nextLine()
    var width: Int?
    var length: Int?
    if(input.isNotEmpty()){
        width = input.split(" ").first().toInt() + 5
        length = input.split(" ").last().toInt() * 2
    }else{
        return
    }
    println("Width = $width")
    println("length = $length")
    println("area = ${width * length}")

}
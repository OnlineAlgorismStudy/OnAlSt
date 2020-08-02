import java.util.*


fun calculateYard2Cm(yd: Double): Double {
    return yd * 91.44
}

fun main(args: Array<String>) {
    val sc: Scanner = Scanner(System.`in`)
    print("yard=? ")
    val yard = sc.nextDouble()

    var foo: Double = calculateYard2Cm(yard)
    println("${yard}yard = ${Math.round(foo * 10.0) / 10.0}cm")
}
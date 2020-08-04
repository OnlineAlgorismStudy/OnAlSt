import kotlin.math.roundToInt

fun calculateYard2Cm(yd: Double): Double {
    return yd * 91.44
}

fun calculateInch2Cm(inch: Double): Double {
    return inch * 2.54
}

fun main() {
    var foo: Double = calculateYard2Cm(2.1)
    var bar: Double = calculateInch2Cm(10.5)

    println("2.1yd = ${Math.round(foo * 10.0) / 10.0}cm")
    println("10.5in = ${Math.round(bar * 10.0) / 10.0}cm")
}
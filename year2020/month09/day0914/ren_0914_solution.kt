package week12


fun main() {

    fun solution(v: Int): Unit {
        if(v >100) return
        for (i in 1..v) {
            for (j in 1..v) {
                print("${i * j} ")
            }
            println()
        }
    }
    solution(3)
}
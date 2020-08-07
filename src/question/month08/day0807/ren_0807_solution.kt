package week6

import java.util.*

/**
 * 10개의 정수를 입력받아 100 미만의 수 중 가장 큰 수와 100 이상의 수 중 가장 작은 수를 출력하는 프로그램을 작성하시오.
(입력되는 정수의 범위는 1이상 10,000 미만이다. 만약 해당하는 수가 없을 때에는 100 을 출력한다.)
 */
fun main() = with(Scanner(System.`in`)) {

    val a = IntArray(10)
    var max = 0
    var min = 10000
    for (i in a.indices) {
        a[i] = nextInt()
        if (a[i] < 100) {
            if(max < a[i]){
                max = a[i]
            }
        }
        if(a[i] > 99){
            if(min > a[i]){
                min = a[i]
            }
        }
    }
    if (max == 0) {
        max = 100
    }
    if (min == 10000) {
        min = 100
    }
    println("$max $min")

}
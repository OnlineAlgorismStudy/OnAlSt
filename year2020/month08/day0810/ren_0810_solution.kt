package week7

import java.util.*

/**
10개의 정수를 입력받아 배열에 저장한 후 짝수 번째 입력된 값의 합과 홀수 번째 입력된 값의 평균을 출력하는 프로그램을 작성하시오.
평균은 반올림하여 소수첫째자리까지 출력한다.
-입력 예
95 100 88 65 76 89 58 93 77 99
-출력 예
sum : 446
avg : 78.8
 */
fun main() = with(Scanner(System.`in`)) {

    val a = IntArray(11)
    var evenSum = 0;
    var oddSum = 0.0;
    var cnt = 0;
    for (i in 1 until 11) {
        a[i] = nextInt()
        if ((i % 2) == 0) {
            evenSum += a[i]
        } else {
            oddSum += a[i]
            cnt++;
        }
    }
    println("sum : ${evenSum}")
    println("avg : ${(oddSum / cnt) * 10 / 10.0}")

}
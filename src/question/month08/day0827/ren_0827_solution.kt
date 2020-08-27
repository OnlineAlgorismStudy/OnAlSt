package week9

import java.util.*

fun main() = with(Scanner(System.`in`)) {

    fun sumArray(array: Array<Int>): Int{
        var sum = 0
        for(number in array){
            sum += number
            print("$number ")
        }
        return sum
    }

    val arr1 = arrayOf(arrayOf(3,5,9), arrayOf(2,11,5),
            arrayOf(8, 30, 10), arrayOf(22, 5, 1))
    var tSum = 0
    for(nums in arr1){
        tSum += sumArray(nums)
        println()
    }
    print(tSum)




}
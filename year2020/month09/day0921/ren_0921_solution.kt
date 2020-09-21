package week13

import java.util.*


fun main() = with(Scanner(System.`in`)) {

    fun bubbleSort(arr: IntArray){
        var swap = true
        while(swap){
            swap = false
            for(i in 0 until arr.size-1){
                if(arr[i] < arr[i + 1]){
                    val temp = arr[i]
                    arr[i] = arr[i + 1]
                    arr[i + 1] = temp

                    swap = true
                }
            }
            println(arr.contentToString())
        }

    }

    val ary = IntArray(10)
    for (i in 0..9) {
        ary[i] = nextInt()
    }

    bubbleSort(ary)

}
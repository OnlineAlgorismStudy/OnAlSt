package question.month08.day0811;

import java.util.Scanner;

public class bangJjo_0811 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*
		10개의 정수를 입력받아 배열에 저장한 후 내림차순으로 정렬하여 출력하시오.


		-입력 예
		95 100 88 65 76 89 58 93 77 99
		-출력 예
		100 99 95 93 89 88 77 76 65 58
*/

		int[] arr = new int[10];
		int num = 0;
		int temp = 0; 
		Scanner sc = new Scanner(System.in);
		
		for(int i = 0; i < arr.length; i++){
			num = sc.nextInt();
			arr[i] = num;
		} // end for
		
		for(int i = 0; i < arr.length; i++) {
			for(int j = 0; j < arr.length-1; j++) {
				if(arr[i] > arr[j]) {
					temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				} // end if
				
			} // end for
		} // end for
		
		for(int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+" ");
		} // end for
		sc.close();
	} // main

} // class

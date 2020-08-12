package question.month08.day0813;

import java.util.Scanner;

public class bangJjo_0813 {

	public static void main(String[] args) {

		int[] arr = new int[100];
		int num = 0;
		int max = -999;
		int min = 999;
		
		Scanner sc = new Scanner(System.in);
		
		for(int i = 0; i < arr.length; i++) {
			num = sc.nextInt();
			arr[i] = num;
			
			if(arr[i] == 999) {
				break;
			} // end if

			if(arr[i] > max) {
				max = arr[i];
			} // end if
			 
			if(arr[i] < min) {
				min = arr[i];
			} // end if
			
		} // end for
		sc.close();
		System.out.println("max : " + max);
		System.out.println("min : " + min);	
	} // main

} // class

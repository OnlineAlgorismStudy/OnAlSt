package question.month09.day0924;

import java.util.Scanner;

public class bangJjo_0924 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		int[] arr = new int[5];
		
		for(int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
			arr[i] = Math.abs(arr[i]);
		} // end for
		
		sc.close();
		
		print(arr);
		
	} // main 

	public static void print(int[] arr) {
		
		int sum = 0;
		
		for(int i = 0; i < arr.length; i++) {
			sum += arr[i];
		} // end for
		System.out.println(sum);
	} // print
	
} // class

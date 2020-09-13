package question.month09.day0917;

import java.util.Scanner;

public class bangJjo_0917 {

	public static void print(int[] arr) {
		
		int temp = 0;
		
		for(int i = 0; i < arr.length; i++) {
			for(int j = 0; j < arr.length; j++) {
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
		
	} // print
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		int num = sc.nextInt();
		
		int[] arr = new int[num];
		
		for(int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		} // end for
		
		print(arr);
		
	} // main

} // class

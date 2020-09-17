package question.month09.day0929;

import java.util.Scanner;

public class bangJjo_0929 {

	final static int cnt = 7;

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arr = new int[cnt];

		Scanner sc = new Scanner(System.in);
		
		for(int i = 0; i < cnt; i++) {
			arr[i] = sc.nextInt();
		} // end for
		
		sc.close();
		
		sort(arr);
		
	} // main

	public static void sort(int arr[]) {
		
		int temp = 0;
		
		for(int i = 0; i < 3; i++) {
			for(int j = 0; j < arr.length-1; j++) {
				if(arr[j] > arr[j + 1]) {
					temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				} // end if
			} // end for
		} // end for
		
		for(int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+ " ");
		} // end for
		
	} // sort
	
} // class

package question.month08.day0828;

import java.util.Scanner;

public class bangJjo_0828 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		int[][] arr = new int[4][2];
		int num = 0;
		int sum = 0;
		
		for(int i = 0; i < arr.length; i++) {
			for(int j = 0; j < arr[i].length; j++) {
				num = sc.nextInt();
				arr[i][j] = num;
			} // end for
		} // end for
		
		for(int i = 0; i < arr.length; i++) {
			for(int j = 0; j < arr[i].length; j++) {
				 sum += arr[i][j];
			} // end for
			System.out.print(sum/arr[i].length+" ");
			sum = 0;
		} // end for
		System.out.println();
		
		for(int i = 0; i < arr[i].length; i++) {
			for(int j = 0; j < arr.length; j++) {
				sum += arr[j][i];
			} // end for
			System.out.print(sum/arr.length+" ");
			sum = 0;
		} // end for
		System.out.println();
		
		for(int i = 0; i < arr.length; i++) {
			for(int j = 0; j < arr[i].length; j++) {
				sum += arr[i][j];
			} // end for
		} // end for
		System.out.println(sum/8+" ");
		
		sc.close();
		
	} // main

} // class

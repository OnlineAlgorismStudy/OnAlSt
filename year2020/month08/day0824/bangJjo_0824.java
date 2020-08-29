package question.month08.day0824;

import java.util.Scanner;

public class bangJjo_0824 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		int[][] arr = new int[5][4];
		int num = 0;
		int sum = 0;
		int cnt = 0;
		
		for(int i = 0; i < arr.length ; i++) {
			for(int j = 0; j < arr[i].length; j++) {
				num = sc.nextInt();
				arr[i][j] = num;
			} // end for
		} // end for
		
		for(int i = 0; i < arr.length; i++) {
			for(int j = 0; j < arr[i].length; j++) {
				sum += arr[i][j];
			} // end for
			
			if(sum / arr[i].length >= 80) {
				System.out.println("pass");
				cnt++;
				sum = 0;
			}else {
				System.out.println("fail");
				sum = 0;
			} // end for
			
		} // end for
		System.out.println("Successful : "+cnt);
		sc.close();
	} // main

} // class
 
package question.month09.day0925;

import java.util.Scanner;

public class bangJjo_0925 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		int num = sc.nextInt();
		
		if(num >= 1 && num <= 20) {
			print(num);
		} // end if
		
		sc.close();
		
	} // main

	public static void print(int num) {
		
		int result = 0;
		
		result = (int) Math.pow(2, num);
		
		System.out.println(result);
	} // print
	
} // class

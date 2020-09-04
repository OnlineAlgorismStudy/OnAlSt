package question.month09.day0907;

import java.util.Scanner;

public class bangJjo_0907 {

	public static int square(int num1, int num2) {
		
		int result = num1;
		
		if(num2 == 0) {
			return 1;
		} // end if
		
		for(int i = 1; i < num2; i++) {
			result *= num1;
		} // end for
		
		return result;
		
	} // square
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		
		sc.close();
		
		int output = square(num1, num2);
		
		System.out.println(output);
	} // main

} // class

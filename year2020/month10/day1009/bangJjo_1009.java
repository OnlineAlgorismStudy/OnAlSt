package question.month10.day1009;

import java.util.Scanner;

public class bangJjo_1009 {

	public static void result(int num) {
		
		if(!(num <= 0)) {
			result(num-2);
			System.out.print(num+" ");
		} // end if
		
		
	} // result
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num = 0;
		Scanner sc = new Scanner(System.in);
		num = sc.nextInt();
		sc.close();
		result(num);
		
	} // main

} // class

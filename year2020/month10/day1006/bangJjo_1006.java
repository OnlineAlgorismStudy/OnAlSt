package question.month10.day1006;

import java.util.Scanner;

public class bangJjo_1006 {

	static Scanner sc = new Scanner(System.in);
	static int num = 0;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		num = sc.nextInt();
		
		if(num <= 50) {
			System.out.println(result(num));
		} // end if
		
		sc.close();
	} // main

	public static int result(int num) {

		if(num <= 1) {
			return 1;
		} // end if
	
		return result(num/2) + result(num-1);
		
	} // result
	

} // class

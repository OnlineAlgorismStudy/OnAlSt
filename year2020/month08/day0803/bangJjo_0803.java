package question.month08.day0803;

import java.util.Scanner;


public class bangJjo_0803 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc =new Scanner(System.in);
		
		char[] c = new char[10];
		
		for(int i = 0; i < c.length; i++) {
			String input = sc.next();
			c[i] = input.charAt(0);
		} // end for
		
		sc.close();
		
		System.out.print(c[0] + " " + c[3] + " " + c[6]);
		
	} // main

} // class

package question.month09.day0922;

import java.util.Scanner;

public class bangJjo_0922 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		
		sc.close();
		
		square(num1, num2);
		
	} // main

	public static void square(int num1, int num2) {
		int a = num1 - num2;
		int b = num1 + num2;
		
		a = (int) Math.pow(a, 2);
		b = (int) Math.pow(b, 3);
		
		System.out.println("("+num1+" - "+num2+")"+" ^ 2 = "+a);
		System.out.println("("+num1+" + "+num2+")"+" ^ 3 = "+b);
		
	} // square
	
} // class

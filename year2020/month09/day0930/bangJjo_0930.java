package question.month09.day0930;

import java.util.Scanner;

public class bangJjo_0930 {

	final static double pi = 3.141592; 
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		System.out.print("radius : ");
		
		double radius = sc.nextDouble();
		
		circle(radius);
		
		sc.close();
	} // main

	public static void circle(double radius) {

		double result = radius * radius * pi; 

		System.out.printf("area = %.3f", result);
	} //circle
	
} // class

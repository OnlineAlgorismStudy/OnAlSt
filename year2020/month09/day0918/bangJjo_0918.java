package question.month09.day0918;

import java.util.Scanner;

public class bangJjo_0918 {

	public static void absolIntMax(int num1, int num2) {
	
		int result = 0;
		
		result = Math.abs(num1) > Math.abs(num2) ? num1 : num2;
		
		System.out.println(result);
	} // absoluteMax
	
	public static void absolDouMin(double num3, double num4) {
	
		double result = 0;
		
		result = Math.abs(num3) > Math.abs(num4) ? num4 : num3;

		System.out.printf("%.2f", result);
	} // absolDouMin	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		double num3 = sc.nextDouble();
		double num4 = sc.nextDouble();
		
		sc.close();
		
		absolIntMax(num1, num2);
		absolDouMin(num3, num4);
		
	} // main

} // class

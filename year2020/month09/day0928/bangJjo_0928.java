package question.month09.day0928;

import java.util.Scanner;

public class bangJjo_0928 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		double num1 = sc.nextDouble();
		double num2 = sc.nextDouble();
		double num3 = sc.nextDouble();

		sc.close();
		
		printA(num1, num2, num3);
		printB(num1, num2, num3);
		
	} // main

	public static void printA(double num1, double num2, double num3) {
		
		double sum = num1 + num2 + num3;
		double avg = sum / 3;
		System.out.println(Math.round(avg));
		
	} // printA
	
	public static void printB(double num1, double num2, double num3) {
		
		double sum = Math.round(num1) + Math.round(num2) + Math.round(num3);
		double avg = sum / 3;
		System.out.println(Math.round(avg));
		
	} // printB
	
} // class

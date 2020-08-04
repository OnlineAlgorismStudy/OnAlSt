package question.month08.day0805;

import java.util.Scanner;

public class bangJjo_0805 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		double[] score = {85.6, 79.5, 83.1, 80.0, 78.2, 75.0}; 
		
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		
		sc.close();
		
		double sum = score[num1 - 1] + score[num2 - 1];
		
		System.out.printf("%.1f", sum);
		
	} // main

} // class

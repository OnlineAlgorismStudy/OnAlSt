package study;

import java.util.Scanner;

public class st0930 {
	final static double pi = 3.141592;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double num1 = sc.nextDouble();

		circle(num1);
	}

	public static void circle(double num1) {
		double result = num1 * num1 * pi;
		System.out.println(Math.round(result*1000)/1000.0);
	}
}

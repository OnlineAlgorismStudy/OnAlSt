package study;

import java.util.Scanner;

public class st0928 {
	public static void cal(double num1, double num2, double num3) {
		// 합계,평균 > 반올림
		double result = (num1 +num2 + num3) / 3;
		// 반올림 > 합계,평균
		double  result2 = Math.round(num1) + Math.round(num2)
		+ Math.round(num3);
		System.out.println(Math.round(result));
		System.out.println(Math.round(result2/3));
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double num1 = sc.nextDouble();
		double num2 = sc.nextDouble();
		double num3 = sc.nextDouble();
		cal(num1,num2,num3);
	}

}

package study;

import java.util.Scanner;

public class st0923 {
	
	public static void cal(double num1,double num2) {
		double result1 = Math.floor(Math.sqrt(num1));
		double result2 = Math.floor(Math.sqrt(num2));
		double max = 0;
		double min = 0;
		int count = 0;
		if(result1 > result2) {
			max = result1;
			min = result2;
		}else {
			max = result2;
			min = result1;
		}
		for(int i = (int)min; i < max; i++) {
			count++;
		}
		System.out.println(count-1);
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double num1 = sc.nextDouble();
		double num2 = sc.nextDouble();
		cal(num1,num2);
		
	}
}

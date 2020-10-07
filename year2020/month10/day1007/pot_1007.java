package study;

import java.util.Scanner;

public class st_1007 {
	static int result = 0;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num1 = sc.nextInt();
		if (num1 < 0 && num1 > 100000000) {
			System.out.println("9이하의 자연수만 입력!!");
		} else {
			System.out.println(recur(num1));
		}
	}

	public static int recur(int num1) {
		int num2;
		if (num1 == 1) {
			return result = result + (num1 * num1);
			
		} else {
			num2 = num1 % 10;
			result = result + (num2 * num2);
			return recur(num1/10);
		}

	}
}

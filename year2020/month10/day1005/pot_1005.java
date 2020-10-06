package study;

import java.util.Scanner;

public class st1006 {
	static int result = 0;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num1 = sc.nextInt();
		recur(num1);
	}

	public static void recur(int num1) {
		if (num1 == 0) {
			System.out.println(result);
			return;
		}
		result += num1;
		recur(num1 - 1);
		
		
	}
}

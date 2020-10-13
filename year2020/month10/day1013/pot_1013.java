package study;

import java.util.Scanner;

public class st1013 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num1 = sc.nextInt();
		System.out.print(recur(num1));
	}

	public static int recur(int num1) {
		if(num1 == 1) {
			return 1;
		}else if(num1 == 2) {
			return 2;
		}else {
			return (recur(num1-2) * recur(num1-1)) % 100;
		}
	}
}

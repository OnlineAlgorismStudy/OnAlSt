package study;

import java.util.Scanner;

public class st1006_2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num1 = sc.nextInt(); // 8 입력
		while (true) {
			if (num1 > 50) {
				System.out.println("다시 입력하세요!");
			} else {
				System.out.println(recur(num1));
				break;
			}

		}
	}

	public static int recur(int num1) {
		if(num1 <=1) {
			return 1;
		}else {
			return recur(num1/2) + recur(num1-1);
		}
	}
}

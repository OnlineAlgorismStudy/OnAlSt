package year2020.month09;

import java.util.Scanner;

public class BR_0924 {

	public static void main(String[] args) {
		/* **************************************************
		 * 문제.
		 * 5개의 정수를 입력받아 각 정수의 절대값의 합을 출력하는 프로그램을 작성하시오.
		 *
		 *
		 * 입력 예.
		 * ===========================
		 * 35 -20 10 0 55
		 * ===========================
		 *
		 * 출력 예.
		 * ===========================
		 * 120
		 * ===========================
		 * **************************************************/
		Scanner sc = new Scanner(System.in);
		
		int result = 0;
		for (int i = 0; i < 5; i++) {
			result += (int) Math.abs(sc.nextInt());
		}
		
		sc.close();
		
		System.out.println(result);
		
	}

}

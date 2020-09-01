package year2020.month09;

import java.util.Scanner;

public class BR_0925 {

	public static void main(String[] args) {
		/* **************************************************
		 * 문제.
		 * 정수 n을 입력받아 2^n의 값을 출력하는 프로그램을 작성하시오. (1 <= n <= 20)
		 *
		 *
		 * 입력 예.
		 * ===========================
		 * 10
		 * ===========================
		 *
		 * 출력 예.
		 * ===========================
		 * 1024
		 * ===========================
		 * **************************************************/
		Scanner sc = new Scanner(System.in);
		
		int sqr = sc.nextInt();
		while (sqr < 1 || sqr > 20) sqr = sc.nextInt();
		
		sc.close();
		
		System.out.println((int) Math.pow(2, sqr));
		
	}

}

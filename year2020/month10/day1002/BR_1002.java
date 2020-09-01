package year2020.month10;

import java.util.Scanner;

public class BR_1002 {
	private static int N = 0;
	
	public static void main(String[] args) {
		/* **************************************************
		 * 문제.
		 * 자연수 N을 입력받아 재귀함수를 이용하여 N부터 1까지 차례대로 출력하는 프로그램을 작성하시오.
		 * N은 50이하의 자연수이다.
		 * 
		 *
		 * 입력 예.
		 * ===========================
		 * 5
		 * ===========================
		 *
		 * 출력 예.
		 * ===========================
		 * 5 4 3 2 1
		 * ===========================
		 * **************************************************/
		Scanner sc = new Scanner(System.in);
		while (N < 1 || N > 50) N = sc.nextInt();
		sc.close();
		
		printN();
		
	}
	
	private static void printN() {
		System.out.print(N--);
		if (N > 0) {
			System.out.print(" ");
			printN();
		}
		
	}
}

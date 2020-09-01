package year2020.month10;

import java.util.Scanner;

public class BR_1001 {
	private static int N = 0;
	
	public static void main(String[] args) {
		/* **************************************************
		 * 문제.
		 * 20 이하의 자연수 N을 입력받아 재귀함수를 이용해서 문자열 "recursive"를 N번 출력하는 프로그램을 작성하시오.
		 *
		 *
		 * 입력 예.
		 * ===========================
		 * 3
		 * ===========================
		 *
		 * 출력 예.
		 * ===========================
		 * recursive
		 * recursive
		 * recursive
		 * ===========================
		 * **************************************************/
		Scanner sc = new Scanner(System.in);
		while (N < 1 || N > 20) N = sc.nextInt();
		sc.close();
		
		printRecursive();
		
	}
	
	private static void printRecursive() {
		System.out.println("recursive");
		if (--N > 0) printRecursive();
	}
}

package year2020.month10;

import java.util.Scanner;

public class BR_1005 {
	private static int N = 0;
	
	public static void main(String[] args) {
		/* **************************************************
		 * 문제.
		 * 100 이하의 자연수 N을 입력받아 재귀함수를 이용하여 1부터 N까지의 합을 구하는 프로그램을 작성하시오.
		 *
		 *
		 * 입력 예.
		 * ===========================
		 * 100
		 * ===========================
		 *
		 * 출력 예.
		 * ===========================
		 * 5050
		 * ===========================
		 * **************************************************/
		Scanner sc = new Scanner(System.in);
		while (N < 1 || N > 100) N = sc.nextInt();
		sc.close();
		
		int result = 0;
		result = addN(result);
		System.out.println(result);
	}
	
	private static int addN(int x) {
		x += N--;
		if (N > 0) {
			return addN(x);
		}
		else return x;
		
	}
}

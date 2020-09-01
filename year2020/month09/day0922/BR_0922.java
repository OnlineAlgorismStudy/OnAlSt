package year2020.month09;

import java.util.Scanner;

public class BR_0922 {

	final static int POWER2(int a, int b) {
		return (int) Math.pow(a-b,2);
	}
	final static int POWER3(int a, int b) {
		return (int) Math.pow(a+b, 3);
	}
	
	public static void main(String[] args) {
		/* **************************************************
		 * 문제.
		 * 정수 두 개를 입력받고 계산식을 매크로 함수로 작성하여 두 수의 차를 제곱한 값과 합을 세제곱한 값을 각각 출력하는 프로그램을 작성하시오.
		 * (거듭제곱은 '^'로 표시하기로 한다.)
		 *
		 *
		 * 입력 예.
		 * ===========================
		 * 5 10
		 * ===========================
		 *
		 * 출력 예.
		 * ===========================
		 * (5 - 10) ^ 2 = 25
		 * (5 + 10) ^ 3 = 3375
		 * ===========================
		 * **************************************************/
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		sc.close();
		
		System.out.printf("(%d - %d) ^ 2 = %d", a, b, POWER2(a,b));
		System.out.println();
		System.out.printf("(%d + %d) ^ 3 = %d", a, b, POWER3(a,b));
	}

}

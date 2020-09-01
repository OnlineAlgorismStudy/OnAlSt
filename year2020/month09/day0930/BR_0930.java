package year2020.month09;

import java.util.Scanner;

public class BR_0930 {
	final static double PI = 3.141592;
	
	final static double CIRCLE (double r) {
		return r*r*PI;
	}
	
	public static void main(String[] args) {
		/* **************************************************
		 * 문제.
		 * 원주율을 3.141592로 매크로 상수로 정의하고 원의 넓이를 구하는 매크로 함수를 작성하여
		 * 반지름을 입력받아 원의 넓이를 출력하는 프로그램을 작성하시오.
		 * (소수 넷째자리에서 반올림)
		 *
		 *
		 * 입력 예.
		 * ===========================
		 * radius : 1.5
		 * ===========================
		 *
		 * 출력 예.
		 * ===========================
		 * area = 7.069
		 * ===========================
		 * **************************************************/
		Scanner sc = new Scanner(System.in);
		System.out.print("radius : ");
		System.out.printf("area = %.3f", CIRCLE(sc.nextDouble()));
		sc.close();
	}
	
}

package year2020.month09;

import java.util.Scanner;

public class BR_0928 {

	public static void main(String[] args) {
		/* **************************************************
		 * 문제.
		 * 세 개의 실수를 입력받아 함계와 평균을 구하여 평균을 반올림한 정수를 출력하고,
		 * 다음은 입력받은 수를 각각 먼저 반올림한 후 합계와 평균을 구하여
		 * 평균을 반올림한 한 결과를 출력하는 프로그램을 작성하시오
		 *
		 *
		 * 입력 예.
		 * ===========================
		 * 153.74 34.56 109.5
		 * ===========================
		 *
		 * 출력 예.
		 * ===========================
		 * 99
		 * 100
		 * ===========================
		 * **************************************************/
		Scanner sc = new Scanner(System.in);
		
		float a = sc.nextFloat();
		float b = sc.nextFloat();
		float c = sc.nextFloat();
		
		sc.close();

		System.out.println(Math.round((a+b+c)/3));
		System.out.println(Math.round((Math.round(a)+Math.round(b)+Math.round(c))/(float)3));
	}
	
	
}

package year2020.month09;

import java.util.Scanner;

public class BR_0923 {

	public static void main(String[] args) {
		/* **************************************************
		 * 문제.
		 * 두 개의 실수를 입력받아 각각의 제곱근을 구하고 두 제곱근 사이에 존재하는 정수의 개수를 출력하는 프로그램을 작성하시오.
		 * 단, 입력받는 두 실수는 양수이며 두 제곱근 사이라는 말은 두 제곱근을 포함한다.
		 *
		 *
		 * 입력 예.
		 * ===========================
		 * 12.0 34.789
		 * ===========================
		 *
		 * 출력 예.
		 * ===========================
		 * 2
		 * ===========================
		 * **************************************************/
		Scanner sc = new Scanner(System.in);
		float a = sc.nextFloat();
		float b = sc.nextFloat();
		
		while (a < 0) a = sc.nextFloat();
		while (b < 0) b = sc.nextFloat();
		
		sc.close();
		
		System.out.println(countInt(Math.sqrt(a), Math.sqrt(b)));
		
	}
	
	private static int countInt(double a, double b) {
		int cnt = (int) Math.abs(Math.floor(a)-Math.floor(b));
		
		if (Math.min(a,b) == (int)Math.min(a, b)) return cnt+1; 
		else return cnt;
	}

}

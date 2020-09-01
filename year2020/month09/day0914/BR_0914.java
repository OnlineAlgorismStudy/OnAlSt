package year2020.month09;

import java.util.Scanner;

public class BR_0914 {

	public static void main(String[] args) {
		/* **************************************************
		 * 문제.
		 * 자연수를 입력받아 아래와 같은 사각형을 출력하는 프로그램을 작성하시오.
		 * 주어지는 수는 100이하의 자연수이다.
		 * (함수를 작성하시오.)
		 *
		 *
		 * 입력 예.
		 * ===========================
		 * 3
		 * ===========================
		 *
		 * 출력 예.
		 * ===========================
		 * 1 2 3
		 * 2 4 6
		 * 3 6 7
		 * ===========================
		 * **************************************************/
		Scanner sc = new Scanner(System.in);
		
		int size = 0;
		while ((size = sc.nextInt()) < 1 || size > 100) {
			continue;
		}
		printSquare(size);
		
		sc.close();
	}
	
	private static void printSquare(int size) {
		for (int i = 1; i <= size; i++) {
			String line = "";
			for (int j = 1; j <= size; j++) {
				line += i*j;
				if (j < size) line += " ";
			}
			System.out.println(line);
		}
	}

}

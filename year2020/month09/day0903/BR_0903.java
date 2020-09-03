package year2020.month09;

import java.util.Scanner;

public class BR_0903 {

	public static void main(String[] args) {
		/* **************************************************
		 * 문제.
		 * 100 미만의 정수만 입력된다. 정수 n을 입력받아 n x n 크기의 숫자사각형을 출력하는 프로그램을 작성하시오.
		 *
		 * 이때 정수 n을 전달받아 숫자 정사각형을 출력하는 함수를 작성하고, 입력받은 정수 n을 함수로 전달하여 출력한다.
		 *
		 *
		 * 입력 예.
		 * ===========================
		 * 4
		 * ===========================
		 *
		 * 출력 예.
		 * ===========================
		 * 1 2 3 4
		 * 5 6 7 8
		 * 9 10 11 12
		 * 13 14 15 16
		 * ===========================
		 * **************************************************/
		Scanner sc = new Scanner(System.in);

		int size = 100;

		while (size >= 100) {
			size = sc.nextInt();
		}
		printSquare(size);
		sc.close();
	}
	
	private static void printSquare(int size) {
		int i = 0;
		while (i < size*size) {
			System.out.print(++i);
			if (i % size == 0) System.out.println();
			else System.out.print(" ");
		}
	}

}

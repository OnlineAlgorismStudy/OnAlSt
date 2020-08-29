package homework;

import java.util.Scanner;

public class badak_0722 {

	/*
	 * 0722
	 * 
	 * 자연수 n을 입력받아 "출력 예"와 같이 출력되는 프로그램을 작성하시오. 주의! '*'과 '*'사이에 공백이 없고 줄사이에도 빈줄이 없다.
	 * 
	 * -입력 예 3 -출력 예
	 *
	 **
	 ***
	 **
	 *
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();

		for (int i = 0; i < a * 2; i++) {
			if (i == 0)
				continue;
			for (int j = Math.abs(a - i); j < a; j++) {

				System.out.print("*");
			}
			System.out.println("");
		}
	}
}

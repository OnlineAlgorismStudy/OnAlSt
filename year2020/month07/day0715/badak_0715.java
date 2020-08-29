package homework;

import java.util.Scanner;

public class badak_0715 {

	/*
	 * 자연수 n을 입력받아서 다음과 같이 출력하는 프로그램을 작성하시오.
	 * 
	 * - 입력 예 3 - 출력 예
	 ***
	 **
	 *
	 *
	 **
	 ***
	 */
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();

		for (int i = 0; i < a * 2; i++) {
			if (i < a) {
				for (int j = i; j < a; j++) {
					System.out.print("*");
				}
			} else {
				for (int j = 0; j <= i-a; j++) {
					System.out.print("*");
				}
			}
			System.out.println("");
		}
	}
}

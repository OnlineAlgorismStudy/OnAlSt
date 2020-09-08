package year2020.month08;
import java.util.Scanner;

public class BR_0821 {
	public static void main(String[] args) throws Exception {
		/* **************************************************
		 * 문제.
		 * 2행 4열의 배열 두 개를 만들어서 입력을 받고 두 배열의 곱을 구하여 출력하는 프로그램을 작성하시오.
		 *
		 *
		 * 입력 예.
		 * ===========================
		 * first array
		 * 1 2 3 4
		 * 5 6 7 8
		 * second array
		 * 1 4 7 8
		 * 3 6 9 8
		 * ===========================
		 *
		 * 출력 예.
		 * ===========================
		 * 1 8 21 32
		 * 15 36 63 64
		 * ===========================
		 * **************************************************/
		Scanner sc = new Scanner(System.in);

		int[][] fstAry = new int[2][4];
		int[][] scdAry = new int[2][4];


		System.out.println("first array");
		for (int i = 0; i < 2; i++) {
			fstAry[i][0] = sc.nextInt();
			fstAry[i][1] = sc.nextInt();
			fstAry[i][2] = sc.nextInt();
			fstAry[i][3] = sc.nextInt();
		}
		System.out.println("second array");
		for (int i = 0; i < 2; i++) {
			scdAry[i][0] = sc.nextInt();
			scdAry[i][1] = sc.nextInt();
			scdAry[i][2] = sc.nextInt();
			scdAry[i][3] = sc.nextInt();
		}

		sc.close();

		for (int i = 0; i < 2; i++) {
			String line = "";
			for (int j = 0; j < 4; j++) {
				line += (fstAry[i][j] * scdAry[i][j]) + " ";
			}
			System.out.println(line.trim());
		}

	}
}

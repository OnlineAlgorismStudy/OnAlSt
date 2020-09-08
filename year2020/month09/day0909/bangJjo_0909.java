package question.month09.day0909;

import java.util.Scanner;

public class bangJjo_0909 {
	public static void gugudan(int num1, int num2) {

		if (num1 < num2) {
			for (int i = num1; i <= num2; i++) {
				System.out.println("== " + i + "dan ==");
				for (int j = 1; j <= 9; j++) {
					System.out.printf(i + " * " + j + " = %2d\n", i * j);
				} // end for
				System.out.println();
			} // end for
		} else if (num1 > num2) {
			for (int i = num2; i <= num1; i++) {
				System.out.printf("== %ddan ==\n", i);
				for (int j = 1; j <= 9; j++) {
					System.out.printf(i + " * " + j + " = %2d\n", i * j);
				} // end for
				System.out.println();
			} // end for
		} // end if

	} // result1

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		sc.close();
		gugudan(num1, num2);
	} // main
} // class

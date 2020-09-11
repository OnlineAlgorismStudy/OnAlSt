package question.month09.day0915;

import java.util.Scanner;

public class bangJjo_0915 {

	public static int squareSub(int num1, int num2) {

		int result = 0;

		if (num1 > 0 && num2 > 0) {
			if (num1 > num2) {
				result = (num1 * num1) - (num2 * num2);
			} else if (num1 < num2) {
				result = (num2 * num2) - (num1 * num1);
			} // end if
		} // end if

		return result;

	} // NumQuadra

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);

		int num1 = sc.nextInt();
		int num2 = sc.nextInt();

		sc.close();

		System.out.println(squareSub(num1, num2));

	} // main

} // class

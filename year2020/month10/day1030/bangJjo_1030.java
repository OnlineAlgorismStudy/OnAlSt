package question.month10.day1030;

import java.util.Scanner;

public class bangJjo_1030 {

	public static void main(String args[]) {

		Scanner sc = new Scanner(System.in);

		char input1 = sc.next().charAt(0);

		char input2 = sc.next().charAt(0);

		int result = (int) input1 - (int) input2;

		System.out.print(((int) input1 + (int) input2) + " ");

		if (result < 0) {

			System.out.print(-result);
		} else {

			System.out.print(result);
		} // end if
		sc.close();
	} // main

} // class
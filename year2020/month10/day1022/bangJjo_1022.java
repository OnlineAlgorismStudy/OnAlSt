package question.month10.day1022;

import java.util.Scanner;

public class bangJjo_1022 {

	public static void main(String args[]) {

		Scanner sc = new Scanner(System.in);

		String input = sc.next();

		int input1 = sc.nextInt();

		sc.close();
		
		String[] change = input.split("");

		if (change.length < input1) {

			for (int i = change.length - 1; i >= 0; i--) {

				System.out.print(change[i]);

			} // end for

		} else {

			for (int i = change.length - 1; i >= change.length - input1; i--) {

				System.out.print(change[i]);

			} // end for

		} // end if

	} // main

} // class
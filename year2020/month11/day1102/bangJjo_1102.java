package question.month11.day1102;

import java.util.Scanner;

public class bangJjo_1102 {

	public static void main(String args[]) {

		Scanner sc = new Scanner(System.in);

		String input1 = sc.next();

		String input2 = sc.next();

		if (input1.length() > input2.length()) {

			System.out.println(input1.length());

		} else {

			System.out.println(input2.length());
		} // end if
		sc.close();
	} // main

} // class
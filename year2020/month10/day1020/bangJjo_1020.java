package question.month10.day1020;

import java.util.Scanner;

public class bangJjo_1020 {

	public static void main(String args[]) {

		Scanner sc = new Scanner(System.in);

		String input = sc.nextLine();

		sc.close();
		if (input.length() <= 100) {
			String result = input + input;
			System.out.println(result);
		} // end if

	} // main

} // class
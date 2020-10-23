package question.month10.day1019;

import java.util.Scanner;

public class bangJjo_1019 {

	public static void main(String args[]) {

		Scanner sc = new Scanner(System.in);

		int input = 0;

		while (true) {

			System.out.print("ASCII code =? ");

			input = sc.nextInt();

			if (input >= 33 && input <= 127) {

				System.out.println((char) input);

			} else {
				break;
			} // end if

		} // end while
		sc.close();

	} // end main

} // end class
package question.month10.day1026;

import java.util.Scanner;

public class bangJjo_1026 {

	public static void main(String args[]) {

		Scanner sc = new Scanner(System.in);

		while (true) {

			char input = sc.next().charAt(0);

			if (input >= 65 && input <= 90) {

				System.out.println(input);
			} else if (input >= 97 && input <= 122) {

				System.out.println(input);

			} else if (input >= 48 && input <= 57) {

				System.out.println((int) input);

			} else {
				break;
			} // end if
		} // end while
		sc.close();
	} // main

} // class
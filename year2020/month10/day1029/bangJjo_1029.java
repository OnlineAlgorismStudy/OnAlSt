package question.month10.day1029;

import java.util.Scanner;

public class bangJjo_1029 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		String str;

		int k = 0;

		char[] chr = new char[100];

		str = sc.nextLine();

		for (int i = 0; i < str.length(); i++) {

			chr[i] = str.charAt(i);

		} // end for

		for (int i = 0; i < str.length(); i++) {

			k = str.length() - 1 - i;

			for (int j = 0; j < str.length(); j++) {

				if (k == str.length())

					k = 0;

				System.out.print(chr[k]);

				k++;

			} // end for

			System.out.println();

		} // end for
		sc.close();
	} // main

} // class
package question.month10.day1028;

import java.util.Scanner;

public class bangJjo_1028 {

	public static void main(String args[]) {

		Scanner sc = new Scanner(System.in);

		String input = sc.nextLine();

		sc.close();
		
		int count = 1;

		for (int i = 0; i < input.length(); i++) {

			if (input.charAt(i) == ' ') {

				count++;

			}

		}

		System.out.println(count);

	} // main

} // class
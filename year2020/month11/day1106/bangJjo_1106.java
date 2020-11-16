package question.month11.day1106;

import java.util.Scanner;

public class bangJjo_1106 {

	public static void main(String args[]) {

		Scanner sc = new Scanner(System.in);

		String str = sc.nextLine();

		String[] arr = str.split(" ");

		for (int i = 0; i < arr.length; i++) {

			if (i % 2 == 0)

				System.out.println(arr[i]);

		} // end for
		sc.close();
	} // main

} // class

package jungwoon;

import java.util.Scanner;

public class Main1116 {

	public static void main(String args[]) {

		Scanner sc = new Scanner(System.in);

		String input = sc.nextLine();

		String[] arr = input.split(" ");

		String result = "";

		int count = 0;

		for (int i = 0; i < arr.length; i++) {

			result += arr[i];

		} // end for

		for (int i = 0; i < result.length(); i++) {

			System.out.print(result.charAt(i));

			count++;

			if (count % 3 == 0) {			
				System.out.println();
			} // end if

		} // end for
		sc.close();
	} // main

} // class
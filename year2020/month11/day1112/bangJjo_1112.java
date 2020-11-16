package question.month11.day1112;

import java.util.Scanner;

public class bangJjo_1112 {

	public static void main(String args[]) {

		Scanner sc = new Scanner(System.in);

		String[] arr = new String[3];

		for (int i = 0; i < arr.length; i++) {

			arr[i] = sc.next();

		} // end for

		String temp;

		for (int i = 0; i < 2; i++) {

			for (int j = i + 1; j < 3; j++) {

				if (arr[i].compareTo(arr[j]) > 0) {

					temp = arr[i];

					arr[i] = arr[j];

					arr[j] = temp;

				} // end if

			} // end for

		} // end for

		System.out.println(arr[0]);
		sc.close();
		
	} // main

} // class
package question.month11.day1110;

import java.util.Scanner;

public class bangJjo_1110 {

	public static void main(String args[]) {

		Scanner sc = new Scanner(System.in);

		String input1 = sc.next();

		String[] arr1 = input1.split("");

		String input2 = sc.next();

		String[] arr2 = input2.split("");

		String result = arr1[0] + arr1[1];
		
		sc.close();

		for (int i = 2; i < arr2.length; i++) {

			result += arr2[i];

		} // end for

		result += arr1[0] + arr1[1];

		System.out.println(result);

	} // main

} // class
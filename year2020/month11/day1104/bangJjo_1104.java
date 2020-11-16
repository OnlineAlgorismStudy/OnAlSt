package question.month11.day1104;

import java.util.Scanner;

public class bangJjo_1104 {

	public static void main(String args[]) {

		Scanner sc = new Scanner(System.in);

		String str = sc.nextLine();

		while (str.length() > 100) {
			str = sc.nextLine(); 
		} // end while
		
		String[] arr = str.split(" ");

		for (int i = 0; i < arr.length; i++) {

			System.out.println((i + 1) + ". " + arr[i]);

		} // end for
		sc.close();
	} // main

} // class

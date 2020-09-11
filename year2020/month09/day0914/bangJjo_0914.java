package question.month09.day0914;

import java.util.Scanner;

public class bangJjo_0914 {

	public static void NumQuadra(int num) {
		if (num <= 100) {

			for (int i = 1; i <= num; i++) {
				for (int j = 1; j <= num; j++) {
					System.out.print(i * j + " ");
				} // end for
				System.out.println();
			} // end for
		} // end if

	} // NumQuadra

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);

		int num = sc.nextInt();

		sc.close();

		NumQuadra(num);

	} // main

} // class

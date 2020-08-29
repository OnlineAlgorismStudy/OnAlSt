package question.month08.day0825;

import java.util.Scanner;

public class bangJjo_0825 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int[] num = new int[100];
		int score = 0;

		for (int i = 0; i < num.length; i++) {
			score = sc.nextInt();

			if (score == 0) {
				break; 
			} // end if

			for (int j = 0; j <= 10; j++) {
				if (j == (int) score / 10) {
					num[j]++;
				} // end if
			} // end for
		} // end for

		for (int i = 10; i >= 0; i--) {
			if (num[i] >= 0) {
				if (num[i] == 0) {
					continue;
				} // end if
				if (i == 0) {
					System.out.println((i + 1) + " : " + num[i] + " person");
				} else {
					System.out.println(i * 10 + " : " + num[i] + " person");
				} // end if
			} // end if
		} // end for
		sc.close();
	} // main

} // class

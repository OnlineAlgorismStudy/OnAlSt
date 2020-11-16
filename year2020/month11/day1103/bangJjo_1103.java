package question.month11.day1103;

import java.util.Scanner;

public class bangJjo_1103 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);

		StringBuffer sb = new StringBuffer(sc.nextLine());

		while (sb.length() > 100) {
			sb = new StringBuffer(sc.nextLine());
		}

		while (sb.length() > 1) {
			int input = sc.nextInt();
			if (input < 1)
				continue;
			if (input > sb.length())
				input = sb.length();
			sb.deleteCharAt(input - 1);
			System.out.println(sb);
		}
		sc.close();
	} // main

} // class

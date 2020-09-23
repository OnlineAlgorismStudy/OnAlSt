package question.month10.day1005;

import java.util.Scanner;

public class bangJjo_1005 {

	static int sum = 0;

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);

		int num = sc.nextInt();

		sc.close();

		result(num);

	} // main

	public static void result(int num) {

		if (num <= 100) {

			if (num == 0) {
				System.out.println(sum);
				return;
			} else {
				sum += num;
				num--;
				result(num);
			} // end if

		} // end if
	} // result

} // class

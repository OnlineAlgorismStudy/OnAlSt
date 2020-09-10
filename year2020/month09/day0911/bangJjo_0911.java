package question.month09.day0911;

import java.util.Scanner;

public class bangJjo_0911 {

	public static int total(int num) {

		int sum = 0;
		if (num <= 1000) {
			for (int i = 1; i <= num; i++) {
				sum += i;
			} // end for
		} else {
			System.out.println("1000 이하의 값으로 입력하세요.");
		} // end if
		
		return sum;
	} // total

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);

		int num = sc.nextInt();

		sc.close();

		System.out.println(total(num));

	} // main

} // class

package study;

import java.util.Scanner;

public class st1001 {
	static Scanner sc = new Scanner(System.in);
	static int length = sc.nextInt();

	public static void main(String[] args) {
		recur(length);

	}

	public static void recur(int length) {
		if (length == 0) {
			return;
		} else {

			System.out.println("recursive");
			recur(length-1);
		}
	}

}

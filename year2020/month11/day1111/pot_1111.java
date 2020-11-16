package study11;

import java.util.Scanner;

public class st_1111 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();

		if (str.contains("c")) {
			System.out.print("Yes");
		} else {
			System.out.print("No");
		}

		if (str.contains("ab")) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}
	}
}

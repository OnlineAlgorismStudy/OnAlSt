package study11;

import java.util.Scanner;

public class st1102 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str1;
		String str2;

		str1 = sc.nextLine(); // 문자열1
		str2 = sc.nextLine(); // 문자열2
		while (str1.length() > 100 || str2.length() > 100) { // 문자열의 길이가 100보다 크면 다시입력받아
			str1 = sc.nextLine(); // 문자열1
			str2 = sc.nextLine(); // 문자열2
		}
		if (str1.length() > str2.length()) {
			System.out.println(str1.length());
		} else {
			System.out.println(str2.length());
		}

	}

}

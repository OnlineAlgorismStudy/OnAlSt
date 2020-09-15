package study;

import java.util.Scanner;

public class study0915 {
	public int cal(int a, int b) {
		int result = 0;
		if (a > b) {
			result = (a * a) - (b * b);
		} else {
			result = (b * b) - (a * a);
		}
		return result;

	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		study0915 st = new study0915();
		int a = sc.nextInt();
		int b = sc.nextInt();
		System.out.println(st.cal(a, b));

	}

}

package study11;

import java.util.Scanner;

public class st_1126 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String data1 = Integer.toString(sc.nextInt());
		String data2 = String.format("%.3f", sc.nextDouble());
		String data3 = sc.next();

		String result = data1 + data2 + data3;
		int length = 0;
		if ((result.length() / 2) % 2 == 1) {
			length = (result.length() / 2) + 1;
		} else {
			length = result.length() / 2;
		}

		System.out.println(result.substring(0, length));
		System.out.println(result.substring(length));

	}
}

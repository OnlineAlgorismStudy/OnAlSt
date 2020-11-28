package study11;

import java.util.Scanner;

public class st_1119 {

	public static void main(String[] args) {
		// 50개 제한
		String[] arr = new String[50];
		Scanner sc = new Scanner(System.in);
		int count = 0;

		// 입력받기
		for (int i = 0; i < arr.length; i++) {
			// 문자입력
			arr[i] = sc.nextLine();
			count++;
			// 0 입력 시
			if (arr[i].equals("0")) {
				break;
			}

		}

		System.out.println(count-1);
		// 출력하기
		for (int j = 0; j < count; j++) {
			if (j % 2 == 0 && !(arr[j]==null)) {
				System.out.println(arr[j]);
			}
		}

	}
}

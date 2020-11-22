package study11;

import java.util.Scanner;

public class st_1118 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		int count = 0;
		// 1,2 번째 인덱스에 l 이있으면 그 단어 출력 하고 갯수 출력
		String[] arr = { "flower", "rose", "lily", "daffodil", "azalea" };
		for (int i = 0; i < arr.length; i++) {
			if (arr[i].charAt(1) == 'l' || arr[i].charAt(2) == 'l') {
				System.out.println(arr[i]);
				count++;
			}
		}
		System.out.println(count);

	}

}

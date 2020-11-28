package study11;

import java.util.Arrays;
import java.util.Scanner;

public class st_1128 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//길이설정
		int length = sc.nextInt();
		String[] arr = new String[length];
		System.out.println(arr.length);

		//입력받기
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.next();
		}
		
		//정렬
		Arrays.sort(arr);
		
		//출력하기
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}

	}

}

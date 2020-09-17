package study;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class st0917 {
	static Scanner sc = new Scanner(System.in); // 입력받기위한 메서드
	static st0917 st = new st0917(); // 객체 생성

	public void cal(Integer[] arr1) {
		for (int i = 0; i < arr1.length; i++) {
			arr1[i] = sc.nextInt();
		}
		Arrays.sort(arr1, Comparator.reverseOrder());
		System.out.println(Arrays.toString(arr1));
	}

	public static void main(String[] args) {

		while (true) {
			int len = sc.nextInt(); // n = 길이 선정
			if (len > 10) {
				System.out.println("10보다 작은수 입력하세요");

			} else {
				Integer[] arr1 = new Integer[len]; // 길이 = n
				st.cal(arr1);
			}

		}

	}

}

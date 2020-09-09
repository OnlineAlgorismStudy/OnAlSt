package study;

import java.util.Scanner;

public class study0909 {
	public void cal(int a, int b) {
		//첫번째가 클수도 있으니 (5,3)
		if (a > b) {
			for (int i = b; i <= a; i++) {
				System.out.println("== " + i + "dan ==");
				for (int j = 1; j < 10; j++) {
					System.out.println(i + " * " + j + " = " + (i * j));
				}
				System.out.println();
			}
		} else { // 두번째가 크다면 (3,5)
			for (int i = a; i <= b; i++) {
				System.out.println("== " + i + "dan ==");
				for (int j = 1; j < 10; j++) {
					System.out.println(i + " * " + j + " = " + (i * j));
				}
				System.out.println();
			}
		}

	}

	public static void main(String[] args) {
		// 두 개의 정수 입력
		// 작은수 ~ 큰수 까지 구구단
		Scanner sc = new Scanner(System.in);
		study0909 st = new study0909();

		int num1 = sc.nextInt();
		int num2 = sc.nextInt();

		st.cal(num1, num2);

	}

}

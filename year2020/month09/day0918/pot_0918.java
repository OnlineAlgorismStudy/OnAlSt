package study;

import java.util.Scanner;

public class st0918 {// 객체를 생성하지 않아도 접근가능 - static
	public static void calInt(int n1, int n2) {
		if (Math.abs(n1) > Math.abs(n2)) {
			System.out.println("정수 : " + n1);
		} else {
			System.out.println("정수 : " + n2);
		}

	}

	public static void calFloat(float fl1, float fl2) {
		if (Math.abs(fl1) > Math.abs(fl2)) {
			System.out.println("실수 : " + fl2);
		} else {
			System.out.println("실수 : " + fl1);
		}

	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n1 = sc.nextInt();
		int n2 = sc.nextInt();
		float fl1 = sc.nextFloat();
		float fl2 = sc.nextFloat();
		calInt(n1, n2);
		calFloat(fl1, fl2);

	}
}

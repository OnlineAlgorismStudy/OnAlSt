import java.util.Scanner;

public class BR_1124 {
	public static void main(String[] args) {
		/* **************************************************
		 * 문제.
		 * 두 개의 문자열 A와 B 한 개의 정수 n을 입력받아서 A에 B를 연결하고, 변경된 문자열  A에서 n개의 문자를 B에 복사한 후 A와 B를 출력하는 프로그램을 작성하시오.
		 * (1 <= n, A, B <= 100)
		 *
		 *
		 * 입력 예.
		 * ===========================
		 * banana apple 3
		 * ===========================
		 *
		 * 출력 예.
		 * ===========================
		 * bananaapple
		 * banle
		 * ===========================
		 * **************************************************/
		Scanner sc = new Scanner(System.in);
		
		String a = sc.next();
		String b = sc.next();
		int n = sc.nextInt();
		
		while (a.length() > 100) a = sc.next();
		while (b.length() > 100) b = sc.next();
		while (n > 100 || n < 1) n = sc.nextInt();
		
		sc.close();
		
		if (n > a.length()) n = a.length();
		a = a + b;
		b = a.substring(0, n) + b.substring(n > b.length() ? b.length() : n);
		
		System.out.println(a);
		System.out.println(b);
	}
}

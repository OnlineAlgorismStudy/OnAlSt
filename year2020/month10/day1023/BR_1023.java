import java.util.Scanner;

public class BR_1023 {
	public static void main(String[] args) {
		/* **************************************************
		 * 문제.
		 * 두 개의 문자열을 입력받아서 두 문자열의 길이의 합을 출력하는 프로그램을 작성하시오.
		 * 각 문자열의 길이는 20자 미만이다.
		 *
		 *
		 * 입력 예.
		 * ===========================
		 * Korean
		 * English
		 * ===========================
		 *
		 * 출력 예.
		 * ===========================
		 * 13
		 * ===========================
		 * **************************************************/
		Scanner sc = new Scanner(System.in);

		int count = 0;
		int len = 0;
		while (count < 2) {
			int tmpLen = sc.nextLine().length();
			if (tmpLen <= 20) {
				len += tmpLen;
				count++;
			}
		}
		
		sc.close();
		
		System.out.println(len);
		
	}
}

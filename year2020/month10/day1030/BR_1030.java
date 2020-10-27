import java.util.Scanner;

public class BR_1030 {
	public static void main(String[] args) {
		/* **************************************************
		 * 문제.
		 * 100개 이하의 문자열을 입력받아서 영문자와 숫자만 출력하되 영문자는 모두 소문자로 출력하는 프로그램을 작성하시오.
		 *
		 *
		 * 입력 예.
		 * ===========================
		 * Hancom1234@cqclass.com
		 * ===========================
		 *
		 * 출력 예.
		 * ===========================
		 * hancom1234cqclasscom
		 * ===========================
		 * **************************************************/
		Scanner sc = new Scanner(System.in);

		String input = sc.nextLine();
		while (input.length() > 100) {
			input = sc.nextLine();
		}
		sc.close();
		
		System.out.println(input.replaceAll("[\\W]", "").toLowerCase());
		
	}
}

import java.util.Scanner;

public class BR_1027 {
	public static void main(String[] args) {
		/* **************************************************
		 * 문제.
		 * 문자열을 입력받아 알파벳 문자만 모두 대문자로 출력하는 프로그램을 작성하시오.
		 * 문자열의 길이는 100이하이다.
		 *
		 *
		 * 입력 예.
		 * ===========================
		 * 1988-Seoul-Olympic!!!
		 * ===========================
		 *
		 * 출력 예.
		 * ===========================
		 * SEOULOLYMPIC
		 * ===========================
		 * **************************************************/
		Scanner sc = new Scanner(System.in);

		String input = sc.nextLine();
		while (input.length() > 100) {
			input = sc.nextLine();
		}
		sc.close();
		
		System.out.println(input.replaceAll("[^A-Za-z]", "").toUpperCase());
		
		
	}
}

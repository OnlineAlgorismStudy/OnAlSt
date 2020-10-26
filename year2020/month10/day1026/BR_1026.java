import java.util.Scanner;
import java.util.regex.Pattern;

public class BR_1026 {
	public static void main(String[] args) {
		/* **************************************************
		 * 문제.
		 * 문자를 입력받아 알파벳 문자인 경우에는 그대로 출력하고 숫자인 경우는 아스키코드값을 출력하는 작업을 반복하다가 기타의 문자가 입력되면 종료하는 프로그램을 작성하시오.
		 * 
		 * * 입출력예에서 진한글씨가 출력
		 *
		 *
		 * 입력 예.
		 * ===========================
		 * A
		 * 1
		 * @
		 * ===========================
		 *
		 * 출력 예.
		 * ===========================
		 * A
		 * 49
		 * @
		 * ===========================
		 * **************************************************/
		Scanner sc = new Scanner(System.in);

		while (true) {
			String input = sc.nextLine();
			if (Pattern.matches("^[A-Za-z]$", input)) {
				System.out.println(input);
			} else if (Pattern.matches("^[0-9]*$", input)) {
				System.out.println((int)input.charAt(0));
			} else {
				break;
			}
		}
		
		sc.close();
		
	}
}

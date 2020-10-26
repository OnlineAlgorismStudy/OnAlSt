import java.util.Scanner;
import java.util.regex.Pattern;

public class BR_1019 {
	public static void main(String[] args) {
		/* **************************************************
		 * 문제.
		 * 33부터 127 까지의 숫자를 계속 입력받아 입력받은 숫자의 아스키코드에 해당하는 문자를 출력하다가 범위를 벗어나는 입력이 들어오면 종료하는 프로그램을 작성하시오.
		 *
		 *
		 * 입력 예.
		 * ===========================
		 * ASCII code =? 66
		 * ASCII code =? 122
		 * ASCII code =? 0
		 * ===========================
		 *
		 * 출력 예.
		 * ===========================
		 * B
		 * z
		 * 
		 * ===========================
		 * **************************************************/
		Scanner sc = new Scanner(System.in);
		
		while (true) {
			System.out.print("ASCII code =? ");
			int input = sc.nextInt();
			if (Pattern.matches("^[A-Za-z]$", String.valueOf((char)input))) {
				System.out.println((char)input);
			} else {
				break;
			}
		}
		
		sc.close();
		
	}
}

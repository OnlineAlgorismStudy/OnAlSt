import java.util.Scanner;

public class BR_1109 {
	public static void main(String[] args) {
		/* **************************************************
		 * 문제.
		 * 20개 이하의 문자열로 된 이름을 입력받아서 그 뒤에 "fighting"을 붙여서 저장하고 출력하는 프로그램을 작성하시오.
		 *
		 *
		 * 입력 예.
		 * ===========================
		 * Korea
		 * ===========================
		 *
		 * 출력 예.
		 * ===========================
		 * Koreafighting
		 * ===========================
		 * **************************************************/
		Scanner sc = new Scanner(System.in);

		String input = sc.nextLine();
		while(input.length() > 20) input = sc.nextLine();
		
		sc.close();

		String out = input + "fighting";
		System.out.println(out);
		
	}
}

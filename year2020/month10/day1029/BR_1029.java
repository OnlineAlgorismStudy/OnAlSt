import java.util.Scanner;

public class BR_1029 {
	public static void main(String[] args) {
		/* **************************************************
		 * 문제.
		 * 문자열을 입력 받아서 문자수만큼 오른쪽으로 한 바퀴 회전하여 출력하는 프로그램을 작성하시오. 문자열의 길이는 100이하이다.
		 *
		 *
		 * 입력 예.
		 * ===========================
		 * PROGRAM
		 * ===========================
		 *
		 * 출력 예.
		 * ===========================
		 * MPROGRA
		 * AMPROGR
		 * RAMPROG
		 * GRAMPRO
		 * OGRAMPR
		 * ROGRAMP
		 * PROGRAM
		 * ===========================
		 * **************************************************/
		Scanner sc = new Scanner(System.in);

		String input = sc.nextLine();
		while (input.length() > 100) {
			input = sc.nextLine();
		}
		sc.close();
		
		StringBuffer sb = new StringBuffer(input);
		
		for (int i = 0; i < input.length(); i++) {
			sb.insert(0, sb.charAt(input.length()-1));
			sb.deleteCharAt(sb.length()-1);
			System.out.println(sb);
		}
		
	}
}

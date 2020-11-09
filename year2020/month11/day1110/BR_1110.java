import java.util.Scanner;

public class BR_1110 {
	public static void main(String[] args) {
		/* **************************************************
		 * 문제.
		 * 20개 이하인 두 개의 문자열을 입력받아 첫 번째 문자열의 앞부분 두자를 두 번째 문자열의 앞부분에 복사하고 다시 뒷부분에 이어 붙여서 저장한 후 두 번째 문자열을 출력하는 프로그램을 작성하시오.
		 *
		 *
		 * 입력 예.
		 * ===========================
		 * ABCDE QWERTY
		 * ===========================
		 *
		 * 출력 예.
		 * ===========================
		 * ABERTYAB
		 * ===========================
		 * **************************************************/
		Scanner sc = new Scanner(System.in);

		String input1 = sc.next();
		String input2 = sc.next();
		while (input1.length() < 2 || input1.length() > 20) input1 = sc.next();
		while (input2.length() < 2 || input2.length() > 20) input2 = sc.next();
		
		sc.close();

		String substrInput1 = input1.substring(0, 2);
		StringBuffer sb = new StringBuffer(input2);
		System.out.println(sb.replace(0, 2, substrInput1).append(substrInput1));
		
	}
}

import java.util.Scanner;

public class BR_1020 {
	public static void main(String[] args) {
		/* **************************************************
		 * 문제.
		 * 문자열을 입력받은 뒤 그 문자열을 이어서 두 번 출력하는 프로그램을 작성하시오. 문자열의 길이는 100이하이다.
		 *
		 *
		 * 입력 예.
		 * ===========================
		 * ASDFG
		 * ===========================
		 *
		 * 출력 예.
		 * ===========================
		 * ASDFGASDFG
		 * ===========================
		 * **************************************************/
		Scanner sc = new Scanner(System.in);
		
		String input = sc.nextLine();
		sc.close();
		
		System.out.println(input + input);
	}
}

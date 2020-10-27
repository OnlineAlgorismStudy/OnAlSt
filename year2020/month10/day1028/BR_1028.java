import java.util.Scanner;

public class BR_1028 {
	public static void main(String[] args) {
		/* **************************************************
		 * 문제.
		 * 공백을 포함한 100글자 이하의 문자열을 입력받아 문장을 이루는 단어의 개수를 출력하는 프로그램을 작성하시오.
		 * 
		 * * 문장입력 할 때 gets()함수 대신 fgets() 함수를 사용하세요. c++14 적용!
		 *
		 *
		 * 입력 예.
		 * ===========================
		 * My name is Kimchulsoo
		 * ===========================
		 *
		 * 출력 예.
		 * ===========================
		 * 4
		 * ===========================
		 * **************************************************/
		Scanner sc = new Scanner(System.in);

		String input = sc.nextLine();
		while (input.length() > 100) {
			input = sc.nextLine();
		}
		sc.close();
		
		System.out.println(input.split(" ").length);
		
		
	}
}

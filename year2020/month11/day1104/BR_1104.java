import java.util.Scanner;

public class BR_1104 {
	public static void main(String[] args) {
		/* **************************************************
		 * 문제.
		 * 공백을 포함한 문자열을 입력받아 다음과 같이 분리하여 번호와 함께 출력하는 프로그램을 작성하시오.
		 * 문자열의 길이는 100자 이하이다.
		 * 
		 * * 문장 입력할 때 gets()함수 대신 fgets() 함수를 사용하세요. c++14 적용!
		 *
		 *
		 * 입력 예.
		 * ===========================
		 * My name is Kimchulsoo
		 * ===========================
		 *
		 * 출력 예.
		 * ===========================
		 * 1. My
		 * 2. name
		 * 3. is
		 * 4. Kimchulsoo
		 * ===========================
		 * **************************************************/
		Scanner sc = new Scanner(System.in);

		String input = sc.nextLine();
		
		while (input.length() > 100) {
			input = sc.nextLine(); 
		}
		
		sc.close();
		
		String[] line = input.split(" ");
		int idx = 0;
		while (idx < line.length) {
			System.out.println((idx+1) + ". " + line[idx]);
			idx++;
		}
		
	}
}

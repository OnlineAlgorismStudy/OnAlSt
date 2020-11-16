import java.util.Scanner;

public class BR_1117 {
	public static void main(String[] args) {
		/* **************************************************
		 * 문제.
		 * 공백을 포함한 문자열을 입력받아 각 단어로 분리하여 문자열 배열에 저장한 후 입력순서의 반대 순서로 출력하는 프로그램을 작성하시오.
		 *
		 *
		 * 입력 예.
		 * ===========================
		 * C++ Programing jjang!!
		 * ===========================
		 *
		 * 출력 예.
		 * ===========================
		 * jjang!!
		 * Programing
		 * C++
		 * ===========================
		 * **************************************************/
		Scanner sc = new Scanner(System.in);

		String input = sc.nextLine();
		
		sc.close();

		String[] words = input.split(" ");
		for (int i = words.length; i > 0; i--) {
			System.out.println(words[i-1]);
		}
	}
}

import java.util.Scanner;

public class BR_1106 {
	public static void main(String[] args) {
		/* **************************************************
		 * 문제.
		 * 공백을 포함한 문장을 입력 받아서 홀수 번째 단어를 차례로 출력하는 프로그램을 작성하시오.
		 * 문장의 길이는 100자 이하이다.
		 *
		 *
		 * 입력 예.
		 * ===========================
		 * I like you better than him.
		 * ===========================
		 *
		 * 출력 예.
		 * ===========================
		 * I
		 * you
		 * than
		 * ===========================
		 * **************************************************/
		Scanner sc = new Scanner(System.in);

		int idx = 0;
		String input = sc.nextLine();
		
		sc.close();

		for (String word : input.split(" ")) {
			if (idx%2 == 0) System.out.println(word);
			idx++;
		}
		
	}
}

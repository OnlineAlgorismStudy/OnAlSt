import java.util.Arrays;
import java.util.Scanner;

public class BR_1120 {
	public static void main(String[] args) {
		/* **************************************************
		 * 문제.
		 * 10 이하의 정수 n을 입력받고 n개의 문자열을 입력받은 후 그 크리를 비교하여 가장 작은 문자열부터 차례로 출력하는 프로그램을 작성하시오.
		 * 문자열의 길이는 100자 이하다. 사전순(아스키코드순)으로 뒤에 나오는 것을 큰 것으로 한다.
		 *
		 *
		 * 입력 예.
		 * ===========================
		 * 3
		 * notebook
		 * pencil
		 * eraser
		 * ===========================
		 *
		 * 출력 예.
		 * ===========================
		 * eraser
		 * notebook
		 * pencil
		 * ===========================
		 * **************************************************/
		Scanner sc = new Scanner(System.in);
		
		int count = sc.nextInt();
		while (count > 10 || count < 0) {
			count = sc.nextInt();
		}

		String[] words = new String[count];
		for (int i = 0; i < count; i++) {
			words[i] = sc.next();
			if (words[i].length() > 100) {
				i--;
			}
		}
		
		sc.close();
		
		Arrays.sort(words);
		for (String word : words) {
			System.out.println(word);
		}
	}
}

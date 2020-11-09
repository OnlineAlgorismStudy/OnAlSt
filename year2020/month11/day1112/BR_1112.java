import java.util.Arrays;
import java.util.Scanner;

public class BR_1112 {
	public static void main(String[] args) {
		/* **************************************************
		 * 문제.
		 * 세 개의 단어를 입력받아 아스키코드(사전) 순으로 가장 먼저 나오는 단어를 출력하는 프로그램을 작성하시오.
		 * 각 단어의 길이는 1이상 10 이하이다.
		 *
		 *
		 * 입력 예.
		 * ===========================
		 * cat dog cow
		 * ===========================
		 *
		 * 출력 예.
		 * ===========================
		 * cat
		 * ===========================
		 * **************************************************/
		Scanner sc = new Scanner(System.in);

		int idx = 0;
		String[] input = new String[3];
		while (idx < 3) {
			String tmp = sc.next();
			if (tmp.length() > 0 && tmp.length() <= 10) {
				input[idx] = tmp;
				idx++;
			}
		}
		
		sc.close();

		Arrays.sort(input);
		System.out.println(input[0]);
		
	}
}

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BR_1119 {
	public static void main(String[] args) {
		/* **************************************************
		 * 문제.
		 * 단어를 입력받다가 "0"을 입력받으면 입력을 종료하고 그 때까지 입력받은 단어의 개수를 출력하고 홀수 번째 입력받은 단어를 한 줄에 1개씩 출력하는 프로그램을 작성하시오.
		 * 단어의 개수는 50개를 넘지 않고, 단어의 길이는 100자 이하이다.
		 *
		 *
		 * 입력 예.
		 * ===========================
		 * keyboard
		 * mouse
		 * monitor
		 * 0
		 * ===========================
		 *
		 * 출력 예.
		 * ===========================
		 * 3
		 * keyboard
		 * monitor
		 * ===========================
		 * **************************************************/
		Scanner sc = new Scanner(System.in);
		
		List<String> words = new ArrayList<String>();
		for (int i = 0; i < 50; i++) {
			String input = sc.next();
			if (input.length() > 100) {
				i--;
				continue;
			} else if ("0".equals(input)) {
				break;
			}else {
				words.add(input);
			}
		}
		
		sc.close();

		System.out.println(words.size());
		for (int i = 0; i < words.size(); i=i+2) {
			System.out.println(words.get(i));
		}
	}
}

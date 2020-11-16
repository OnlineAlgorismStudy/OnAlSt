import java.util.Scanner;

public class BR_1118 {
	public static void main(String[] args) {
		/* **************************************************
		 * 문제.
		 * "flower" "rose" "lily" "daffodil" "azalea" 5개의 단어를 초기화한 후 한 개의 문자를 입력받아서
		 * 입력받은 문자가 두 번째나 세 번째에 포함된 단어를 모두 출력하고 마지막 줄에 출력한 단어의 개수를 출력하는 프로그램을 작성하시요.
		 *
		 *
		 * 입력 예.
		 * ===========================
		 * l
		 * ===========================
		 *
		 * 출력 예.
		 * ===========================
		 * flower
		 * lily
		 * 2
		 * ===========================
		 * **************************************************/
		Scanner sc = new Scanner(System.in);
		
		String[] words = {"flower", "rose", "lily", "daffodil", "azalea"};
		String input = sc.next().substring(0, 1);
		
		sc.close();

		int count = 0;
		for (String word : words) {
			if (word.indexOf(input, 1) == 1 || word.indexOf(input, 1) == 2) {
				System.out.println(word);
				count++;
			}
		}
		System.out.println(count);
	}
}

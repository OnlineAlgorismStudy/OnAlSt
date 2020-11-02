import java.util.Scanner;

public class BR_1102 {
	public static void main(String[] args) {
		/* **************************************************
		 * 문제.
		 * 두 개의 단어를 입력받아서 길이가 긴 단어의 문자 개수를 출력하는 프로그램을 작성하시오.
		 * 단어의 길이는 100자 이하다.
		 *
		 *
		 * 입력 예.
		 * ===========================
		 * excel powerpoint
		 * ===========================
		 *
		 * 출력 예.
		 * ===========================
		 * 10
		 * ===========================
		 * **************************************************/
		Scanner sc = new Scanner(System.in);

		int longer = 0;
		int cnt = 0;
		
		while (cnt < 2) {
			String[] tmp = sc.nextLine().split(" ");
			for (String line : tmp) {
				if (line.length() <= 100 && line.length() > longer) {
					longer = line.length();
					cnt++;
				}
				if (cnt >= 2) break;
			}
		}
		sc.close();
		
		System.out.println(longer);
		
	}
}

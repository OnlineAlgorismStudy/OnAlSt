import java.util.Scanner;

public class BR_1103 {
	public static void main(String[] args) {
		/* **************************************************
		 * 문제.
		 * 문자열(100자 이하)을 입력받은 후 정수를 입력받아 해당위치의 문자를 제거하고 출력하는 작업을 반복하다가 문자 1개가 남으면 종료하는 프로그램을 작성하시오.
		 * 
		 * 첫 번째 문자의 위치는 1이며 만약 입력받은 번호가 문자열의 길이 이상이면 마지막 문자를 제거한다.
		 * 
		 * * 입출력예에서 진한글씨가 출력
		 *
		 *
		 * 입력 예.
		 * ===========================
		 * word
		 * 3
		 * 1
		 * 10
		 * ===========================
		 *
		 * 출력 예.
		 * ===========================
		 * wod
		 * od
		 * d
		 * ===========================
		 * **************************************************/
		Scanner sc = new Scanner(System.in);

		StringBuffer input = new StringBuffer(sc.nextLine());
		
		while (input.length() > 100) {
			input = new StringBuffer(sc.nextLine()); 
		}
		
		while (input.length() > 1) {
			int idx = sc.nextInt();
			if (idx < 1) continue;
			if (idx > input.length()) idx = input.length();
			input.deleteCharAt(idx-1);
			System.out.println(input);
		}
		sc.close();
		
	}
}

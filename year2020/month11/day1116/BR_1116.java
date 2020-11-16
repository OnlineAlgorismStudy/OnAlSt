import java.util.Scanner;

public class BR_1116 {
	public static void main(String[] args) {
		/* **************************************************
		 * 문제.
		 * 5개의 정수를 입력받아 모두 붙여서 문자열로 저장한 후 세 자씩 나누어서 출력하는 프로그램을 작성하시오.
		 *
		 *
		 * 입력 예.
		 * ===========================
		 * 12 5963 58 1 45678
		 * ===========================
		 *
		 * 출력 예.
		 * ===========================
		 * 125
		 * 963
		 * 581
		 * 456
		 * 78
		 * ===========================
		 * **************************************************/
		Scanner sc = new Scanner(System.in);

		int[] nums = new int[5];
		for (int i = 0; i < 5; i++) {
			nums[i] = sc.nextInt();
		}
		
		sc.close();

		String input = "";
		for (int num : nums) {
			input += Integer.toString(num);
		}
		
		for (int i = 0; i < (input.length()/3)+1; i++) {
			int start = i*3;
			int end = (i+1)*3;
			if (end > input.length()) end = input.length();
			System.out.println(input.substring(start, end));
		}
	}
}

import java.util.Scanner;

public class BR_0720 {

	public static void main(String[] args) {
		/* **************************************************
		 * 문제.
		 * 자연수 n( 3 <= n <= 10) 을 입력받아 다음과 같이 영문자를 출력하는 프로그램을 작성하시오.​​​
		 * 
		 * 입력 예.
		 * ===========================
		 * 3
		 * ===========================
		 * 
		 * 출력 예.
		 * ===========================
		 * ABC
		 * DE
		 * F
		 * ===========================
		 * **************************************************/

		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		sc.close();

		if (num > 10 || num < 3) return;
		
		String alphabets = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		int sttIdx = 0;
		
		String lines = "";
		for (int i = num; i > 0; i--) {
			int endIdx = sttIdx + i;
			
			if (endIdx > alphabets.length()) {
				lines += alphabets.substring(sttIdx);
				
				sttIdx = 0;
				endIdx = endIdx - alphabets.length();
			}
			
			lines += alphabets.substring(sttIdx, endIdx);
			lines += "\n";
			
			sttIdx = endIdx;
		}
		
		System.out.print(lines);
		
	}
	
}

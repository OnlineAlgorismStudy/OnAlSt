import java.util.Scanner;

public class BR_0721 {

	public static void main(String[] args) {
		/* **************************************************
		 * 문제.
		 * 자연수 n을 입력받아서 n개의 줄에 n+1개의 숫자 혹은 문자로 채워서 다음과 같이 출력하는 프로그램을 작성하시오.​​​
		 * 
		 * 입력 예.
		 * ===========================
		 * 3
		 * ===========================
		 * 
		 * 출력 예.
		 * ===========================
		 * 1 2 3 A
		 * 4 5 B C
		 * 6 D E F
		 * ===========================
		 * **************************************************/

		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		sc.close();

		String numbers = "1234567890";
		String alphabets = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		int numIdx = 0;
		int alpIdx = 0;
		
		String lines = "";
		for (int i = 1; i <= num; i++) {
			int numEIdx = numIdx + (num - i) + 1;
			int alpEIdx = alpIdx + i;
			
			String line = "";
			
			if (numEIdx > numbers.length()) {
				line += numbers.substring(numIdx);
				
				numIdx = 0;
				numEIdx = numEIdx - numbers.length();
			}
			
			line += numbers.substring(numIdx, numEIdx);
			
			if (alpEIdx > alphabets.length()) {
				line += alphabets.substring(alpIdx);
				
				alpIdx = 0;
				alpEIdx = alpEIdx - alphabets.length();
			}
			
			line += alphabets.substring(alpIdx, alpEIdx);
			
			line = line.replaceAll(".", "$0 ").trim();
			
			alpIdx = alpEIdx;
			numIdx = numEIdx;
			lines += line;
			lines += "\n";
		}
		
		System.out.print(lines);
		
	}
	
}

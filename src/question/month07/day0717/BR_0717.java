import java.util.Scanner;

public class BR_0717 {

	public static void main(String[] args) {
		/* **************************************************
		 * 문제.
		 * 자연수 n을 입력받아서 다음과 같이 출력하는 프로그램을 작성하시오.​​​
		 * 
		 * 입력 예.
		 * ===========================
		 * 3
		 * ===========================
		 * 
		 * 출력 예.
		 * ===========================
		 * *****
		 *  ***
		 *   *
		 * ===========================
		 * **************************************************/

		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		sc.close();

		String stars = "";
		for (int i = num; i > 0; i--) {
			String line = "";
			for (int j = 0; j < 2*i-1; j++) {
				line += "*";
			}
			String space = "";
			if (num != i) space = String.format("%" + (num - i) + "s", " ");
			stars += space + line;
			stars += "\n";
		}
		System.out.print(stars);
		
	}
	
}

import java.util.Scanner;

public class BR_0729 {

	public static void main(String[] args) {
		/* **************************************************
		 * 문제.
		 * 자연수 n을 입력받아 "출력 예"와 같이 출력되는 프로그램을 작성하시오.
		 * 주의! '#'은 공백으로 구분하되 줄사이에 빈줄은 없다.​​​
		 * 
		 * 입력 예.
		 * ===========================
		 * 3
		 * ===========================
		 * 
		 * 출력 예.
		 * ===========================
		 * #
		 * # #
		 * # # #
		 *   # #
		 *     #
		 * ===========================
		 * **************************************************/

		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		sc.close();

		String chr = "#";
		for (int i = 0; i < num; i++) {
			String line = "";
			for (int j = 0; j < i+1; j++ ) {
				line += chr + " ";
			}
			System.out.println(line.trim());
		}
		for (int i = num - 1; i > 0; i--) {
			String line = "";
			for (int j = 0; j < i; j++ ) {
				line += chr + " ";
			}
			System.out.println(String.format("%" + (2*num-1) + "s", line.trim()));
		}
		
	}
	
}

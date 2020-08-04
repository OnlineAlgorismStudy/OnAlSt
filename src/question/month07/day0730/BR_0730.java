import java.util.Scanner;

public class BR_0730 {

	private static int ODD_NUM = 9;
	public static void main(String[] args) {
		/* **************************************************
		 * 문제.
		 * 자연수 n을 입력받아 "출력 예"와 같이 n x n크기에 공백으로 구분하여 출력되는 프로그램을 작성하시오.
		 * 10 미만의 홀수만 출력하시오.주의! 숫자는 공백으로 구분하되 줄사이에 빈줄은 없다.
		 * 
		 * 입력 예.
		 * ===========================
		 * 3
		 * ===========================
		 * 
		 * 출력 예.
		 * ===========================
		 * 1 3 5
		 * 7 9 1
		 * 3 5 7
		 * ===========================
		 * **************************************************/

		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		sc.close();

		for (int i = 0; i < num; i++) {
			String line = "";
			for (int j = 0; j < num; j++) {
				line += getNextOdd();
			}
			System.out.println(line.trim());
		}
		
	}
	
	private static String getNextOdd() {
		ODD_NUM += 2;
		if (ODD_NUM > 10) {
			ODD_NUM = 1;
		}
		return String.format("%2s", Integer.toString(ODD_NUM));
	}
	
}

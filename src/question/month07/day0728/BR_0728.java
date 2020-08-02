import java.util.Scanner;

public class BR_0728 {

	public static void main(String[] args) {
		/* **************************************************
		 * 문제.
		 * 자연수 n을 입력받아 "출력 예"와 같이 공백으로 구분하여 출력하는 프로그램을 작성하시오.
		 * 주의! 숫자를 공백으로 구분하되 줄사이에 빈줄은 없다.​​​
		 * 
		 * 입력 예.
		 * ===========================
		 * 3
		 * ===========================
		 * 
		 * 출력 예.
		 * ===========================
		 * 1 2 3
		 *   4 5
		 *     6
		 * ===========================
		 * **************************************************/

		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		sc.close();

		int a = 1;
		String[] lines = new String[num];
		for (int i = 0; i < num; i++) {
			String line = "";
			for (int j = 0; j < num - i; j++) {
				line += " " + Integer.toString(a++);
				if (a == 10) a = 0;
			}
			lines[i] = line;
		}
		
		if (null != lines && lines.length > 0) {
			for (String line : lines) {
				System.out.println(String.format("%" + lines[0].length() + "s", line));
			}
		}
	}
}

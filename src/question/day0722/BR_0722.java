import java.util.Scanner;

public class BR_0722 {

	public static void main(String[] args) {
		/* **************************************************
		 * 문제.
		 * 자연수 n을 입력받아 "출력 예"와 같이 출력되는 프로그램을 작성하시오.
		 * 주의! '*'과 '*'사이에 공백이 없고 줄사이에도 빈줄이 없다.​​​
		 * 
		 * 입력 예.
		 * ===========================
		 * 3
		 * ===========================
		 * 
		 * 출력 예.
		 * ===========================
		 * *
		 * **
		 * ***
		 * **
		 * *
		 * ===========================
		 * **************************************************/

		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		sc.close();

		String star = "*";
		String stars = "";
		for (int i = 1; i < num; i++) {
			stars += new String(new char[i]).replace("\0", star);
			stars += "\n";
		}
		for (int i = num; i > 0; i--) {
			stars += new String(new char[i]).replace("\0", star);
			stars += "\n";
		}
		System.out.print(stars);
		
	}
	
}

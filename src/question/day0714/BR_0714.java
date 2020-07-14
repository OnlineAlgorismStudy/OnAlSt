import java.util.Scanner;

public class BR_0714 {

	public static void main(String[] args) {
		/* **************************************************
		 * 문제.
		 * 자연수 n을 입력받아서 n줄만큼 다음과 같이 출력하는 프로그램을 작성하시오.​​​
		 * 
		 * 입력 예.
		 * ===========================
		 * 5
		 * ===========================
		 * 
		 * 출력 예.
		 * ===========================
		 * *
		 * **
		 * ***
		 * ****
		 * *****
		 * ===========================
		 * **************************************************/

		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		sc.close();

		String star = "*";
		String stars = "";
		for (int i = 1; i <= num; i++) {
			stars += new String(new char[i]).replace("\0", star);
			stars += "\n";
		}
		System.out.print(stars);
		
	}
	
}

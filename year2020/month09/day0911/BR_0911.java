import java.util.Scanner;

public class BR_0911 {
	public static void main(String[] args) {
		/* **************************************************
		 * 문제.
		 * 1부터 전달받은 수까지의 합을 출력하는 함수를 작성하고 1000 이하의 자연수를 입력받아 작성한 함수로 전달하여 출력하는 프로그램을 작성하시오.
		 *
		 *
		 * 입력 예.
		 * ===========================
		 * 100
		 * ===========================
		 *
		 * 출력 예.
		 * ===========================
		 * 5050
		 * ===========================
		 * **************************************************/
		Scanner sc = new Scanner(System.in);
		
		int to = sc.nextInt();
		while (to < 1 || to > 1000) {
			to = sc.nextInt();
		}
		
		sc.close();
		
		System.out.println(addUpTo(to));
	}
	
	private static int addUpTo (int to) {
		int result = 0;
		for (int i = 1; i <= to; i++) {
			result += i;
		}
		return result;
	}
}

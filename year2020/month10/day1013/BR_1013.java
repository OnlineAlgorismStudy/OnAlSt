package year2020.month10;
import java.util.Scanner;

public class BR_1013 {
	public static void main(String[] args) throws Exception {
		/* **************************************************
		 * 문제.
		 * 첫 번째는 1, 두 번째는 2, 세 번째부터는 앞의 두 수의 곱을 100으로 나눈 나머지로 이루어진 수열이 있다.
		 * 100 이하의 자연수 N을 입력받아 재귀함수를 이용하여 N번째 값을 출력하는 프로그램을 작성하시오.
		 *
		 *
		 * 입력 예.
		 * ===========================
		 * 8
		 * ===========================
		 *
		 * 출력 예.
		 * ===========================
		 * 92
		 * ===========================
		 * **************************************************/
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		while (n < 1 || n > 100) {
			n = sc.nextInt();
		}
		sc.close();
		
		System.out.println(getNthNum(n));
		
	}
	
	private static int getNthNum(int n) {
		if (n == 1) return 1;
		else if (n == 2) return 2;
		else {
			return (getNthNum(n-1)*getNthNum(n-2))%100;
		}
	}
}

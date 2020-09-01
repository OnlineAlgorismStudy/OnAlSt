package year2020.month10;
import java.util.Scanner;

public class BR_1015 {
	public static void main(String[] args) throws Exception {
		/* **************************************************
		 * 문제.
		 * 3자리로 이루어진 자연수 3개를 입력받아 그 수들의 곱을 구한 후
		 * 그 결과값의 각 자리 숫자들 중 0을 제외한 모든 수들의 곱을 구하여 출력하는 프로그램을 재귀함수로 작성하시오.
		 *
		 *
		 * 입력 예.
		 * ===========================
		 * 100 123 111
		 * ===========================
		 *
		 * 출력 예.
		 * ===========================
		 * 270
		 * ===========================
		 * **************************************************/
		
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		while (a < 100 || a > 999) {
			a = sc.nextInt();
		}
		while (b < 100 || b > 999) {
			b = sc.nextInt();
		}
		while (c < 100 || c > 999) {
			c = sc.nextInt();
		}
		sc.close();
		
		System.out.println(multiplyNumbers(a*b*c));
		
	}
	
	private static int multiplyNumbers(int number) {
		int curr = (number%10 == 0 ? 1 : number%10);
		if (number < 10) {
			return curr;
		} else {
			return curr * multiplyNumbers(number/10);
		}
	}
}

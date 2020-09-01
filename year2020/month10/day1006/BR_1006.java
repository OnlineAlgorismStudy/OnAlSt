package year2020.month10;
import java.util.Scanner;

public class BR_1006 {
	public static void main(String[] args) throws Exception {
		/* **************************************************
		 * 문제.
		 * 첫 번째 수는 1이고 N번째 수는 (N/2)번째 수(파이썬인 경우 N//2번째)와 (N-1)번째 수의 합으로 구성된 수열이 있다.
		 * 50 이하의 자연수 N을 입력받아 재귀호출을 이용하여 이 수열에서 N번째 수를 출력하는 프로그램을 작성하시오.
		 * (1 2 3 5 7 10 13 18 ...)
		 *
		 *
		 * 입력 예.
		 * ===========================
		 * 8
		 * ===========================
		 *
		 * 출력 예.
		 * ===========================
		 * 18
		 * ===========================
		 * **************************************************/
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		while (n < 1 || n > 50) {
			n = sc.nextInt();
		}
		System.out.println(findNthNum(n));
		
		sc.close();
		
	}
	
	private static int findNthNum(int n) {
		if (n == 1) return 1;
		else {
			int nthNum = findNthNum(n/2) + findNthNum(n-1);
			return nthNum;
		}
	}
}

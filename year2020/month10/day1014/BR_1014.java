package year2020.month10;
import java.util.Scanner;

public class BR_1014 {
	public static void main(String[] args) throws Exception {
		/* **************************************************
		 * 문제.
		 * 100만 이하의 자연수 N을 입력받아 짝수이면 2로 홀수이면 3으로 나누는 작업을 반복하다가
		 * 그 값이 1이 되면 그때까지 나누었던 작업의 횟수를 출력하는 프로그램을 재귀함수로 작성하시오.
		 *
		 *
		 * 입력 예.
		 * ===========================
		 * 100
		 * ===========================
		 *
		 * 출력 예.
		 * ===========================
		 * 6
		 * ===========================
		 * **************************************************/
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		while (n < 1 || n > 1000000) {
			n = sc.nextInt();
		}
		sc.close();
		
		System.out.println(countLevel(n, 0));
		
	}
	
	private static int countLevel(int n, int level) {
		if (n%2 == 0) n = n/2;
		else n= n/3;
		
		if (n == 1) return ++level;
		else return countLevel(n, ++level);
	}
}

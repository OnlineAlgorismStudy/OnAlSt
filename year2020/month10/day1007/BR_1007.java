package year2020.month10;
import java.util.Scanner;

public class BR_1007 {
	public static void main(String[] args) throws Exception {
		/* **************************************************
		 * 문제.
		 * 9자리 이하의 자연수를 입력받아 재귀함수를 이용하여 각 자리 숫자의 제곱의 합을 출력하는 프로그램을 작성하시오.
		 * ( main()함수에 변수 하나, 재귀함수에 매개변수 하나만을 사용할 수 있다.)
		 *
		 *
		 * 입력 예.
		 * ===========================
		 * 12345
		 * ===========================
		 *
		 * 출력 예.
		 * ===========================
		 * 55
		 * ===========================
		 * **************************************************/
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		while (n < 1 || n > 1000000000) {
			n = sc.nextInt();
		}
		System.out.println(addSquaredN(n));
		
		sc.close();
		
	}
	
	private static int addSquaredN(int n) {
		if (n > 10) return ((n%10)*(n%10)) + addSquaredN((int)(n/10));
		else return n*n; 
	}
}

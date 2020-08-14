package month08;
import java.util.Scanner;

public class BR_0814 {
	public static void main(String[] args) throws Exception {
		/* **************************************************
		 * 문제.
		 * 100 개 이하의 정수를 입력받다가 0 이 입력되면 그 때까지 입력된 정수 중 5의 배수의 개수와 합계 평균을 출력하는 프로그램을 작성하시오.
		 * 평균은 소수점 이하 1자리까지 출력한다.
		 * 
		 * 
		 * 입력 예.
		 * ===========================
		 * 35 10 23 100 64 51 5 0
		 * ===========================
		 * 
		 * 출력 예.
		 * ===========================
		 * Multiples of 5 : 4
		 * sum : 150
		 * avg : 37.5
		 * ===========================
		 * **************************************************/
		
		Scanner sc = new Scanner(System.in);
		
		int input;
		int inputCnt = 0;
		int cnt = 0;
		int sum = 0;
		while((input = sc.nextInt()) != 0 && inputCnt < 100) {
			if (input%5 == 0) {
				cnt++;
				sum += input;
			}
			inputCnt++;
		}
		
		System.out.println("Multiples of 5 : " + cnt);
		System.out.println("sum : " + sum);
		System.out.println("avg : " + String.format("%.1f", (double)sum/(double)cnt));
		
		sc.close();

	}
}

package month08;
import java.util.Scanner;

public class BR_0813 {
	public static void main(String[] args) throws Exception {
		/* **************************************************
		 * 문제.
		 * 세 자리 이하의 정수를 차례로 입력 받다가 999가 입력되면 프로그램을 종료하고 그 때까지 입력된 최대값과 최소값을 출력하는 프로그램을 작성하시오.입력받는 정수는 100개 이하이다.
		 * 
		 * 
		 * 입력 예.
		 * ===========================
		 * 45 19 123 58 10 -55 16 -1 999
		 * ===========================
		 * 
		 * 출력 예.
		 * ===========================
		 * max : 123
		 * min : -55
		 * ===========================
		 * **************************************************/
		
		Scanner sc = new Scanner(System.in);
		
		int input;
		int min = 0;
		int max = 0;
		boolean first = true;
		while((input = sc.nextInt()) != 999) {
			if (input > 999) {
				System.out.println("세 자리 이하의 정수만 입력하세요.");
				continue;
			}
			if (first) {
				min = input;
				max = input;
				first = false;
			} else {
				min = Integer.min(min, input);
				max = Integer.max(max, input);
			}
		}
		
		sc.close();
		System.out.println("max : " + max + "\nmin : " + min);
    }
}

package year2020.month09;
import java.util.Scanner;

public class BR_0902 {
	private static double PI = 3.14;
	public static void main(String[] args) throws Exception {
		/* **************************************************
		 * 문제.
		 * 반지름의 길이를 전달받아 넓이를 출력하는 함수를 작성하고 반지름의 길이를 입력받아 함수를 호출하여 넓이를 출력하는 프로그램을 작성하시오.
		 * (원주율은 3.14로 하고 반올림하여 소수 둘째자리까지 출력한다. 원의 넓이 = 반지름 * 반지름 * 원주율이다.)
		 * 
		 * 
		 * 입력 예.
		 * ===========================
		 * 10
		 * ===========================
		 * 
		 * 출력 예.
		 * ===========================
		 * 314.00
		 * ===========================
		 * **************************************************/
		
		Scanner sc = new Scanner(System.in);
		
		printCircle(sc.nextInt());
		
		sc.close();
		
	}
	
	private static void printCircle(int r) {
		
		System.out.println(String.format("%.2f", r*r*PI));
		
	}
}

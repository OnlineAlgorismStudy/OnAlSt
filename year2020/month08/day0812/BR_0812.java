package month08;
import java.util.Scanner;

public class BR_0812 {
	public static void main(String[] args) throws Exception {
		/* **************************************************
		 * 문제.
		 * 10개의 정수를 입력받아 홀수 번째 입력받은 정수의 합과 짝수 번째 입력받은 정수의 합을 출력하는 프로그램을 작성하시오.
		 * 
		 * 
		 * 입력 예.
		 * ===========================
		 * 10 20 25 66 83 7 22 90 1 100
		 * ===========================
		 * 
		 * 출력 예.
		 * ===========================
		 * odd : 141
		 * even : 283
		 * ===========================
		 * **************************************************/
		
		Scanner sc = new Scanner(System.in);
		
		int[] input = new int[10];
		
		for (int i = 0; i < 10; i++) {
			input[i] = sc.nextInt();
		}
		
		sc.close();
		System.out.println(printResult(input));
    }
	
	private static String printResult(int[] numbers) {
		int odd = 0;
		int even = 0;
		
		for (int i = 0; i < numbers.length; i++) {
			if (i%2 == 0) {
				//홀수번째
				odd += numbers[i];
			} else {
				even += numbers[i];
			}
		}
		
		return "odd : " + odd + "\neven : " + even;
	}
}

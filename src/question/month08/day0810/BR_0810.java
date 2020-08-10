import java.util.Scanner;

public class BR_0810 {
	public static void main(String[] args) throws Exception {
		/* **************************************************
		 * 문제.
		 * 10개의 정수를 입력받아 배열에 저장한 후 짝수 번째 입력된 값의 합과 홀수 번째 입력된 값의 평균을 출력하는 프로그램을 작성하시오.
		 * 평균은 반올림하여 소수첫째자리까지 출력한다.
		 * 
		 * 
		 * 입력 예.
		 * ===========================
		 * 95 100 88 65 76 89 58 93 77 99
		 * ===========================
		 * 
		 * 출력 예.
		 * ===========================
		 * sum : 446
		 * avg : 78.8
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
		int sum = 0;
		int avg = 0;
		
		for (int i = 0; i < numbers.length; i++) {
			if (i%2 != 0) {
				// 짝수번째 입력된 값
				sum += numbers[i];
			} else {
				avg += numbers[i];
			}
			
		}
		
		return "sum : " + sum + "\navg : " + (avg/5.0);
	}
}

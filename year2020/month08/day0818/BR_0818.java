package month08;
import java.util.Scanner;

public class BR_0818 {
	public static void main(String[] args) throws Exception {
		/* **************************************************
		 * 문제.
		 * 20 이하의 정수 n을 입력받고 n명의 점수를 입력받아 높은 점수부터 차례로 출력하는 프로그램을 작성하시오.
		 * 
		 * 
		 * 입력 예.
		 * ===========================
		 * 5
		 * 35 10 35 100 64
		 * ===========================
		 * 
		 * 출력 예.
		 * ===========================
		 * 100
		 * 64
		 * 35
		 * 35
		 * 10
		 * ===========================
		 * **************************************************/
		
		Scanner sc = new Scanner(System.in);
		
		int inputCnt;
		while ((inputCnt = sc.nextInt()) > 20 || inputCnt < 1) {
			System.out.println("다시 입력하세요.");	
		}
		int[] numbers = new int[inputCnt];
		for (int i = 0; i < inputCnt; i++) {
			numbers[i] = sc.nextInt();
		}
		
		sc.close();

		for (int number : fnArrange(numbers)) {
			System.out.println(number);
		}

		

	}
	
	private static int[] fnArrange(int[] numbers) {
		for (int i = 0; i < numbers.length-1; i++) {
			for (int j = i+1; j < numbers.length; j++) {
				if (numbers[j] > numbers[i]) {
					int tmp = numbers[j];
					numbers[j] = numbers[i];
					numbers[i] = tmp;
				}
			}
		}
		
		return numbers;
	}
}

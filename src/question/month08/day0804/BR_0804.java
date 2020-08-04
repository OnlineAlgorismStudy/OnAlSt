import java.util.Scanner;

public class BR_0804 {
	private static int ARRAY_SIZE = 100; 
	public static void main(String[] args) throws Exception {
		/* **************************************************
		 * 문제.
		 * 100 개의 정수를 저장할 수 있는 배열을 선언하고 정수를 차례로 입력받다가
		 * 0 이 입력되면 0 을 제외하고 그 때까지 입력된 정수를
		 * 가장 나중에 입력된 정수부터 차례대로 출력하는 프로그램을 작성하시오.
		 * 
		 * 입력 예.
		 * ===========================
		 * 3 5 10 55 0
		 * ===========================
		 * 
		 * 출력 예.
		 * ===========================
		 * 55 10 5 3
		 * ===========================
		 * **************************************************/
		
		Scanner sc = new Scanner(System.in);
		
		int[] input = new int[ARRAY_SIZE];
		
		int length = 0;
		for (length = 0; length < ARRAY_SIZE; length++) {
			input[length] = sc.nextInt();
			if (input[length] == 0) {
				break;
			}
		}
		String result = "";
		while (length > 0) {
			result += input[--length] + " ";
		}
		System.out.println(result.trim());
        sc.close();
    }
}

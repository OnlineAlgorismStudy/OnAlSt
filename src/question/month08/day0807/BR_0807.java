import java.util.Scanner;

public class BR_0807 {
	public static void main(String[] args) throws Exception {
		/* **************************************************
		 * 문제.
		 * 10개의 정수를 입력받아 100 미만의 수 중 가장 큰 수와 100 이상의 수 중 가장 작은 수를 출력하는 프로그램을 작성하시오.
		 * 
		 * (입력되는 정수의 범위는 1이상 10,000 미만이다. 만약 해당하는 수가 없을 때에는 100 을 출력한다.)
		 * 
		 * 
		 * 입력 예.
		 * ===========================
		 * 88 123 659 15 443 1 99 313 105 48
		 * ===========================
		 * 
		 * 출력 예.
		 * ===========================
		 * 99 105
		 * ===========================
		 * **************************************************/
		
		Scanner sc = new Scanner(System.in);
		
		int[] input = new int[10];
		
		int i = 0;
		while (i < 10) {
			input[i] = sc.nextInt();
			if (input[i] >= 10000 || input[i] < 1) {
				System.out.println("입력가능한 숫자는 1 이상 10000 미만의 정수입니다.\n다른 숫자를 입력하세요.");
				i = 0;
			} else i++;
		}
		
		sc.close();
		
		System.out.println(getMinMax(input));
    }
	
	private static String getMinMax(int[] numbers) {
		int min = -1;
		int max = -1; 
		
		for (int number : numbers) {
			if (number < 100) {
				if (max == -1 || max < number) max = number;
			} else {
				if (min == -1 || min > number) min = number;
			}
		}
		if (min == -1) min = 100;
		if (max == -1) max = 100;
		
		return max + " " + min;
	}
}

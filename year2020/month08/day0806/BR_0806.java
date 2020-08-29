import java.util.Scanner;

public class BR_0806 {
	public static void main(String[] args) throws Exception {
		/* **************************************************
		 * 문제.
		 * 10개의 정수를 입력받아 그 중 가장 작은 수를 출력하는 프로그램을 작성하시오.(입력받을 정수는 1000을 넘지 않는다.)
		 * 
		 * 
		 * 입력 예.
		 * ===========================
		 * 5 10 8 55 6 31 12 24 61 2
		 * ===========================
		 * 
		 * 출력 예.
		 * ===========================
		 * 2
		 * ===========================
		 * **************************************************/
		
		Scanner sc = new Scanner(System.in);
		
		int[] input = new int[10];
		
		int i = 0;
		while (i < 10) {
			input[i] = sc.nextInt();
			if (input[i] > 1000) {
				System.out.println("입력하시는 숫자는 1000을 넘을 수 없습니다.\n다른 숫자를 입력하세요.");
			} else i++;
		}
		
		sc.close();
		for(int number:input) System.out.print(number + " ");
		System.out.println();
		System.out.println(getMinNum(input));
    }
	
	private static int getMinNum(int[] numbers) {
		int min = numbers[0];
		
		for (int number : numbers) {
			if (min > number) min = number;
		}
		
		return min;
	}
}

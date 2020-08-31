import java.util.Scanner;

public class BR_0929 {
	final static int CNT = 7;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int[] numbers = new int[CNT];
		for (int i = 0; i < CNT; i++) {
			numbers[i] = sc.nextInt();
		}
		
		sc.close();

		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < CNT-1-i; j++) {
				if (numbers[j] > numbers[j+1]) {
					int tmp = numbers[j];
					numbers[j] = numbers[j+1];
					numbers[j+1] = tmp;
				}
			}
		}
		
		String result = "";
		for (int number : numbers) {
			result += number + " ";
		}
		System.out.println(result.trim());
	}
	
	
}

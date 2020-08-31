import java.util.Scanner;

public class BR_1002 {
	private static int N = 0;
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while (N < 1 || N > 50) N = sc.nextInt();
		sc.close();
		
		printN();
		
	}
	
	private static void printN() {
		System.out.print(N--);
		if (N > 0) {
			System.out.print(" ");
			printN();
		}
		
	}
}

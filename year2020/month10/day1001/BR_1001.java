import java.util.Scanner;

public class BR_1001 {
	private static int N = 0;
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while (N < 1 || N > 20) N = sc.nextInt();
		sc.close();
		
		printRecursive();
		
	}
	
	private static void printRecursive() {
		System.out.println("recursive");
		if (--N > 0) printRecursive();
	}
}

import java.util.Scanner;

public class BR_1005 {
	private static int N = 0;
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while (N < 1 || N > 100) N = sc.nextInt();
		sc.close();
		
		int result = 0;
		result = addN(result);
		System.out.println(result);
	}
	
	private static int addN(int x) {
		x += N--;
		if (N > 0) {
			return addN(x);
		}
		else return x;
		
	}
}

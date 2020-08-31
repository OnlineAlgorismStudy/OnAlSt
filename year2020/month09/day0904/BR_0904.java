import java.util.Scanner;

public class BR_0904 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println(getMax(sc.nextInt(), sc.nextInt(), sc.nextInt()));
		
		sc.close();

	}
	
	private static int getMax(int a, int b, int c) {
		int max = a;
		if (b > max) max = b;
		if (c > max) max = c;
		
		return max;
	}

}

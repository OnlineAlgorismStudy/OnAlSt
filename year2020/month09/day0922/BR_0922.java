import java.util.Scanner;

public class BR_0922 {

	final static int POWER2(int a, int b) {
		return (int) Math.pow(a-b,2);
	}
	final static int POWER3(int a, int b) {
		return (int) Math.pow(a+b, 3);
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		sc.close();
		
		System.out.printf("(%d - %d) ^ 2 = %d", a, b, POWER2(a,b));
		System.out.println();
		System.out.printf("(%d + %d) ^ 3 = %d", a, b, POWER3(a,b));
	}

}

import java.util.Scanner;

public class BR_0918 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		float c = sc.nextFloat();
		float d = sc.nextFloat();
		sc.close();
		
		System.out.println(Math.max(Math.abs(a), Math.abs(b)) == Math.abs(a) ? a : b);
		System.out.println(String.format("%.2f", Math.min(Math.abs(c), Math.abs(d)) == Math.abs(c) ? c : d));
	}

}

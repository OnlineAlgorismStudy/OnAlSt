import java.util.Scanner;

public class BR_0924 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int result = 0;
		for (int i = 0; i < 5; i++) {
			result += (int) Math.abs(sc.nextInt());
		}
		
		sc.close();
		
		System.out.println(result);
		
	}

}

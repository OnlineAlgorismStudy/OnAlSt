import java.util.Scanner;

public class BR_0907 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println(getPower(sc.nextInt(), sc.nextInt()));
		
		sc.close();

	}
	
	private static int getPower(int num, int times) {
		return (int) Math.pow(num, times);
	}

}

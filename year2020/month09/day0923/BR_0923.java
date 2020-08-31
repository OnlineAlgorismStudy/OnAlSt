import java.util.Scanner;

public class BR_0923 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		float a = sc.nextFloat();
		float b = sc.nextFloat();
		
		while (a < 0) a = sc.nextFloat();
		while (b < 0) b = sc.nextFloat();
		
		sc.close();
		
		System.out.println(countInt(Math.sqrt(a), Math.sqrt(b)));
		
	}
	
	private static int countInt(double a, double b) {
		return (int) Math.abs(Math.floor(a)-Math.floor(b));
	}

}

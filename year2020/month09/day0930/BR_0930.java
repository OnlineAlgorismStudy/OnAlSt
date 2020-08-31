import java.util.Scanner;

public class BR_0930 {
	final static double PI = 3.141592;
	
	final static double CIRCLE (double r) {
		return r*r*PI;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("radius : ");
		System.out.printf("area = %.3f", CIRCLE(sc.nextDouble()));
		sc.close();
	}
	
}

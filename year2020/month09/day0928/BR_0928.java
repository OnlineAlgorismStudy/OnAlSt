import java.util.Scanner;

public class BR_0928 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		float a = sc.nextFloat();
		float b = sc.nextFloat();
		float c = sc.nextFloat();
		
		sc.close();

		System.out.println(Math.round((a+b+c)/3));
		System.out.println(Math.round((Math.round(a)+Math.round(b)+Math.round(c))/(float)3));
	}
	
	
}

import java.util.Scanner;

public class BR_0925 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int sqr = sc.nextInt();
		while (sqr < 1 || sqr > 20) sqr = sc.nextInt();
		
		sc.close();
		
		System.out.println((int) Math.pow(2, sqr));
		
	}

}

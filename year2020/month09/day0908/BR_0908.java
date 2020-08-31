import java.util.Scanner;

public class BR_0908 {

	private static int a = 0;
	private static int b = 0;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		BR_0908.a = sc.nextInt();
		BR_0908.b = sc.nextInt();
		
		while (BR_0908.a == BR_0908.b) {
			BR_0908.b = sc.nextInt();
		}
		
		sc.close();
		
		changeVal();
		System.out.println(BR_0908.a + " " + BR_0908.b);
	}
	
	private static void changeVal() {
		if (BR_0908.a > BR_0908.b) {
			BR_0908.a = (int) Math.floor(BR_0908.a/2);
			BR_0908.b = BR_0908.b * 2;
		}
		else {
			BR_0908.a = BR_0908.a * 2;
			BR_0908.b = (int) Math.floor(BR_0908.b/2);
		}
	}

}

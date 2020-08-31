import java.util.Scanner;

public class BR_0915 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int temp1 = sc.nextInt();
		int temp2 = sc.nextInt();
		
		while (temp1 < 0) {
			temp1 = sc.nextInt();
		}
		while (temp2 < 0) {
			temp2 = sc.nextInt();
		}
		
		System.out.println(getSquaredDiff(Math.max(temp1, temp2), Math.min(temp1, temp2)));
		
		sc.close();
	}
	
	private static int getSquaredDiff(int big, int small) {
		return (int)Math.pow(big, 2) - (int)Math.pow(small, 2);
	}

}

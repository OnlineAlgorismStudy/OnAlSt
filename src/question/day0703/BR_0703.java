import java.util.Scanner;

public class BR_0703 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int[] rect = {sc.nextInt()+5, sc.nextInt()*2};
		sc.close();
		
		System.out.println("width = " + rect[0]);
		System.out.println("length = " + rect[1]);
		System.out.println("area = " + rect[0]*rect[1]);
	}

}

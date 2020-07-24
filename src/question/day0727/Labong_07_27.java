import java.util.Scanner;

public class Labong_07_27 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int num = sc.nextInt();
		int count = num-1;
		
		for(int i = 1; i<=num;i++) {
			for(int k=0; k<count; k++) {
				System.out.print(" ");
			}
			
			for(int j=1; j<=i; j++) {
				System.out.print(j);
			}
			count--;
			System.out.println("");
		}
	}

}

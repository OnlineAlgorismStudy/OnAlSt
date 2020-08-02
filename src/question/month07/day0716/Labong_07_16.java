import java.util.Scanner;

public class Labong_07_16 {

	public static void main(String[] args) {
		// 으
		Scanner sc = new Scanner(System.in);
		System.out.print("search: ");
		int num = sc.nextInt();
		 
		for(int i = 0; i < num; i++) {
			for(int a = 0; a < i; a++ ) {
				System.out.print(" ");
			}
			
			for(int s = num; s > i; s--) {
				System.out.print("*");
			}
			System.out.println("");
		}
	

	}

}

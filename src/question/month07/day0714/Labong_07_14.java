import java.util.Scanner;

public class Labong_07_14 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("ют╥б: ");
		int num = sc.nextInt();
		
		for(int i=0; i < num;i++) {
			for(int k = 0; k <= num; k++) {
				if(k <= i) {
					System.out.print("*");	
				}
									
			}
			System.out.println("");
		}

	}

}

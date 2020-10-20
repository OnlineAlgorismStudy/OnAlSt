package october;

import java.util.Scanner;

public class Labong_10_19 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int num;
		while(true){
			System.out.print("ASCIT code =? ");
			num = sc.nextInt();
			
			if(num < 33 || num >127) {
				break;
			}
			System.out.println((char)num);
			
		}
		

	}

}

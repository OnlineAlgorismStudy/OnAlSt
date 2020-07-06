package homework;

import java.util.Scanner;

public class badak_0706 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		
		System.out.println((a % 400 == 0) || (a % 4 == 0)?"leap year":"commmon year");	
	}
}


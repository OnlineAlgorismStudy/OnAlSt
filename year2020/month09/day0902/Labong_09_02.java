package september;

import java.util.Scanner;

public class Labong_09_02 {
	
	public static void ex(int num) {
		System.out.printf("%.2f",num*num*3.14);
	}

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		ex(sc.nextInt());

	}

}

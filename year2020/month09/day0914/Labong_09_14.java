package september;

import java.util.Scanner;

public class Labong_09_14 {
	static int count = 1;
	static void out(int num) {
			for(int i=1; i<=num; i++) {
				for(int i2=1; i2<=3; i2++) {
					System.out.print(i*count + " ");
					count++;
				}
				System.out.println();
				count = 1;
			}
		}
	
	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		
		out(sc.nextInt());
	}
	
}

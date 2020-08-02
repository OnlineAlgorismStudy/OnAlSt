import java.util.Scanner;

public class Labong_07_28 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int count = 1;
		
		for(int i=0; i<num; i++) {
			for(int k=1; k <= i;k++) {
				System.out.print("  ");
			}
			
			for(int a=0; a < num-i; a++) {
				if(count == 10) {
					count = 0;
				}
				
				System.out.print(count+" ");
				count++;
			}
			System.out.println("");
		} // for
		
	} // main

}

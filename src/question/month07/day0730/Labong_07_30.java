import java.util.Scanner;

public class Labong_07_30 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int num = sc.nextInt();
		int count = 1;
		
		for(int i=0; i < num; i++) {		
			for(int k=0; k<num;k++) {
				if(count >= 10) {
					count = 1;
				}
				System.out.print(count+" ");
				count += 2;		
			}		
			System.out.println("");
		} // for

	} // main

}

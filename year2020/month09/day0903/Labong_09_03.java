package september;

import java.util.Scanner;

public class Labong_09_03 {
	
	public static void rectangle(int num) {
		int count = 1;
		
		for(int i=0; i<num;i++) {
			for(int i2=0; i2<num; i2++) {
				System.out.print(count + " ");
				count++;
			}
			System.out.println();
		} // for

	} 

	public static void main(String[] args) {	
		Scanner sc = new Scanner(System.in);
		
		rectangle(sc.nextInt());
	}

}

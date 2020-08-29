package august;

import java.util.Arrays;
import java.util.Scanner;

public class Labong_08_18 {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		
		Integer[] num = new Integer[20];
		
		System.out.print("How many?");
		int pp = sc.nextInt();
		
		for(int i=0; i<pp;i++) {
			num[i] = sc.nextInt();
		}                       
		
		Arrays.sort(num,0,pp);
		
		for (int k = pp-1; 0 <= pp; k--) {
			System.out.println(num[k]);
		}
		 
	}

}

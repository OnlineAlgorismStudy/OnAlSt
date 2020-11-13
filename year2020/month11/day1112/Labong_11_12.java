package november;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class Labong_11_12 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String[] chArr = new String[3];
		int[] intArr = new int[3];
		
		for(int i=0; i<3; i++) {
			chArr[i] = sc.next();
		}

		Arrays.sort(chArr);
		System.out.println(chArr[0]);
		
		
		
		
		

	}

}

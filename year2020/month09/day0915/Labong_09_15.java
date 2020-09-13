package september;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class Labong_09_15 {
	
	static void result(int num1,int num2 ) {
		int[] su = {num1,num2};
		Arrays.sort(su);
		
		for(int i=1; i<=su.length;i++) {
			su[i-1] = su[i-1] * su[i-1];
		}
		System.out.println(su[1] - su[0]);
	}

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		result(sc.nextInt(),sc.nextInt());
	}

}

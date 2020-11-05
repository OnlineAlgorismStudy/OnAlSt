package november;

import java.util.Scanner;

public class Labong_11_05 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String[] arr = new String[5];
		
		for(int i=0; i<arr.length; i++) {
			System.out.println(i);
			arr[i] = sc.next();
			if(arr[i].length() > 30) {
				i--;
				continue;
			}
		}
		
		for(int g=arr.length-1; g>=0; g--) {
			System.out.println(arr[g]);
		}

	}

}

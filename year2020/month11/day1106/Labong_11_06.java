package november;

import java.util.Scanner;

public class Labong_11_06 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String str = sc.nextLine();
		
		String[] arr = str.split(" ");
		
		for(int i=0; i<arr.length; i++) {
			if(i % 2 == 0) {
				System.out.println(arr[i]);
			}
		}

	}

}

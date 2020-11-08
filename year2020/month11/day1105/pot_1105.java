package study11;

import java.util.Scanner;

public class st_1108 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String[] arr = new String[5];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextLine();
		}
		
		for (int i = arr.length; i > 0; i--) {
			System.out.println(arr[i-1]);
		}

	}

}

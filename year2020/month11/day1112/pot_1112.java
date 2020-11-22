package study11;

import java.util.Arrays;
import java.util.Scanner;

public class st_1112 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String[] arr = new String[3];
		
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextLine();
		}
		
		Arrays.sort(arr);
		System.out.println(arr[0]);
	}

}

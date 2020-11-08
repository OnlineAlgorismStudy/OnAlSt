package study11;

import java.util.Scanner;

public class st_1104 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		String[] arr = str.split(" ");
		int count = 0 ;
		for (int i = 0; i < arr.length; i++) {
			if(arr[i] != " ") {
				count++;
			}
			System.out.print(count+". ");
			System.out.print(arr[i]);
			System.out.println();
		}
	}

}

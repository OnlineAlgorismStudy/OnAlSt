package november;

import java.util.Scanner;

public class Labong_11_10 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String str = sc.nextLine();
		String[] arr = str.split(" ");
		
		String temp = arr[0].substring(0,2);
		arr[1] = arr[1].substring(2,arr[1].length());
		
		System.out.println(temp+arr[1]+temp);
		

	}

}

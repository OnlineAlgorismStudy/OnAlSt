package study11;

import java.util.Scanner;

public class st_1113 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		int num1 = Integer.parseInt(str.replaceAll("[^0-9]", " ").substring(0,2));
		System.out.println(num1*2);
		double num2 = Double.parseDouble((str.replaceAll("[^0-9|.]", "").substring(0,4)));
		System.out.println(num2+"0");
		

	}

}

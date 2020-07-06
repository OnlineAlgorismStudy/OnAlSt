import java.util.Scanner;

public class Labong_07_06 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("year : ");
		int year = sc.nextInt();
		
		sc.close();
		
		String result = (year%400 == 0) || (year%4 == 0 && year%100 != 0) ? "leep year" : "common year";
		
		System.out.println(result);
		
		
	}
}

import java.util.Scanner;

public class Labong_07_15 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("�Է�: ");
		int num = sc.nextInt();
		int num2 = num*2;
		String result = "";
		
		for(int i = 0; i < num; i++) {
			for(int k = i; k < num ; k++) {
				result += "*";
							
			}
			result += "\n";		
		} // for
		
		for(int a = 0; a < num; a++) {
			for(int b = 0; b <= a; b++) {
				result += "*";
			}
			result += "\n";
		} // for
		
		System.out.println(result);
		
	} // main

}

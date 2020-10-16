package october;

import java.util.Scanner;

public class Labong_10_13 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int s = sc.nextInt();
		
		System.out.println(result(s,""));
	}
	
	static int result(int s, String a) {
		System.out.println(s+" " + a);
		if(s == 1) {
			return 1;
		}else if(s == 2) {
			return 2;
		}else {
			return result(s-2,"one")*result(s-1,"two")%100;
		}
		
		
	}

}

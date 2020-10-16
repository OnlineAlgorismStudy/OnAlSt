package october;

import java.util.Scanner;

public class Labong_10_14 {
	
	static int count = 0;
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int s = sc.nextInt();
		
		System.out.println(count(s));
	
	}
	static int count(int s) {
		if(s == 1) {
			return count;
		}else if(s % 2 == 1) {
			count++;
			return count(s / 2);
		}else{
			count++;
			return count(s / 2);
		}
	}
}

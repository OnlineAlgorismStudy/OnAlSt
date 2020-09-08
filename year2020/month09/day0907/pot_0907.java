package study;

import java.util.Scanner;

public class study0907 {
	public int squ(int a, int b) {
		int result = 1;
		for (int i = 0; i < b; i++) {
			result *= a;
		}
		return result;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		study0907 met = new study0907();
		int a = sc.nextInt();
		int b = sc.nextInt();
		System.out.println(met.squ(a, b));
		
		
	}

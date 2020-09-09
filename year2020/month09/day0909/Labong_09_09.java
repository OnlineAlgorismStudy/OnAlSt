package september;

import java.util.Scanner;

public class Labong_09_09 {
	
	static void gogodan(int[] gogodan) {
		for(int k=gogodan[0]; k<=gogodan[1];k++) {
			System.out.println("== "+k+"dan ==");
			for(int k2=1; k2<=9; k2++) {
				System.out.println(k+" * "+k2+" = "+(k*k2));
			}
		}
	}

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int[] num = new int[2];
		for(int i=0; i<2;i++) {
			num[i] = sc.nextInt();
		}
		Arrays.sort(num);
		gogodan(num);
	}

}

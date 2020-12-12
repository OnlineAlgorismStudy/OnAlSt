package november;

import java.util.Scanner;

public class Labong_11_26 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int num = sc.nextInt();
		double jNum = sc.nextDouble();
		String str = sc.next();
		
		str = (num+""+jNum+""+str).replaceAll(" ","");
		num = str.length();
		
		for(int i=0; i<num; i++) {
			if(i < num/2) {
				System.out.print(str.charAt(i));
			}else {
				if(i == num/2) {
					System.out.println();
				}
				System.out.print(str.charAt(i));
			}
			
		}
		sc.close();
	}

}

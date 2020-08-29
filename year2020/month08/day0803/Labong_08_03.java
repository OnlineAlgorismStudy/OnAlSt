import java.util.Scanner;

public class Labong_08_03 {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		String[] str = new String[10];
		
		for(int k=0;k<str.length;k++) {
			str[k] = sc.next();
		}

		for(int i=0; i<str.length;i++) {
			if(i == 0 || i == 3 || i ==6) {
				System.out.print(str[i] + " ");
			}
		} // for
		
	} // main

}

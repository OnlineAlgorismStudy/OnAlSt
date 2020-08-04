import java.util.Scanner;

public class Labong_08_04 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int[] str = new int[100];	
		
		for(int i=0; i<str.length;i++) {
			str[i] = sc.nextInt();
			if(str[i] == 0) {
				break;
			}
		} // for
		
		for(int k=str.length-1; k>=0;k--) {
			
			if(str[k] != 0) {
				System.out.print(str[k] + " ");			
			}		
		} // for
		
	} // main

}

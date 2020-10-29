package october;

import java.util.Scanner;

public class Labong_10_28 {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		
		String str = sc.nextLine();
		
		int count = 0;
		
		for(int i=0; i< str.length(); i++) {
			if(str.charAt(i) == ' ') {
				count +=1;
			}
		}
		System.out.println(count+1);

	}

}

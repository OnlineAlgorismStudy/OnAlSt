package november;

import java.util.Arrays;
import java.util.Scanner;

public class Labong_11_20 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
			
			int number = 0;
			String[] str = null;
			
			number = sc.nextInt();
			if(number >10) { System.out.println("10이하의 입력해야 합니다.");}
			else {
				str = new String[number];
				
				for(int i=0; i<number; i++) {
					str[i] = sc.next();
				}
				
				for(int k=0; k< str.length; k++) {
					Arrays.sort(str);
					System.out.println(str[k]);
				}	
				
				
			}
			
	}

}

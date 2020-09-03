package september;

import java.util.Scanner;

public class Labong_09_07 {  // 미완성 @@@@@@@@ 
		
	 
	static int make(int num1 , int num2) {
		int count =0;
		
		for(int i=1; i < num2; i++) {
			if(count ==0) {
				count += num1 * num1;			
			}else {
				count *= num1;
			}			
		}
		return count;
	}

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println(make(sc.nextInt(),sc.nextInt()));
	}

}

package november;

import java.util.Scanner;

public class Labong_11_23 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String[] strArr = new String [5];
		String[] str = new String[2];
		int count=0;
		
		for(int i=0; i<strArr.length;i++) {
			strArr[i] = sc.next();
		}
		str[0] = sc.next();
		str[1] = sc.next();
		
		for(int i2=0; i2<strArr.length; i2++) {
			if(strArr[i2].contains(str[0]) || strArr[i2].contains(str[1])) {
				System.out.println(strArr[i2]);
				count++;
			}
		}
		
		if(count == 0) {System.out.println("none");}
	}

}

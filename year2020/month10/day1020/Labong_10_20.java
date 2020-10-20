package october;

import java.util.Scanner;

public class Labong_10_20 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		String m = sc.next();
		
		System.out.println(m.length() <100 ? "":"10이하의 수를 입력해주십시오.");
		
		System.out.println(m.toString()+m.toString());
		
	}

}

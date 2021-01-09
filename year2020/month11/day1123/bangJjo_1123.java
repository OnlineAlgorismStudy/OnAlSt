package question.month11.day1123;

import java.util.Scanner;

public class bangJjo_1123 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		String[] words = new String[5];
		for (int i = 0; i < 5; i++) {
			words[i] = sc.next();
			if (words[i].length() > 100) {
				i--;
			} // end if
		} // end for
		
		String str1 = sc.next().substring(0, 1);
		String str2 = sc.next();
		sc.close();
		
		String result = "";
		for (String word : words) {
			if (word.indexOf(str1) > -1 || word.indexOf(str2) > -1) {
				result += word+"\n"; 
			} // end if
		} // end for		
		
		if("".equals(result)) {
			System.out.println("none");
		} else {
			System.out.println(result.trim());
		} // end if
		
	} // end main

} // end class

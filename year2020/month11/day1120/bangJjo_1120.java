package question.month11.day1120;

import java.util.Arrays;
import java.util.Scanner;

public class bangJjo_1120 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		int cnt = sc.nextInt();
		
		while(cnt > 10 || cnt < 0 ) {
			cnt = sc.nextInt();
		} // end while
		
		String[] words = new String[cnt];
		for (int i = 0; i < cnt; i++) {
			words[i] = sc.next();
			if (words[i].length() > 100) {
				i--;
			} // end if
		} // end for		 
		
		Arrays.sort(words);
		for (String word : words) {
			System.out.println(word);
		} // end for		
		
		sc.close();
		
	} // end main

} // end class

package question.month11.day1124;

import java.util.Scanner;

public class bangJjo_1124 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String[] str = new String[2];

		for (int i = 0; i < str.length; i++) {
			str[i] = sc.next();
		} // end for
		
		System.out.println(str[0] + str[1]);
		
		str[0] += str[1];
		int num = sc.nextInt();

		String c = "";
		
		for (int i = 0; i < str[0].length(); i++) {
			if (num > str[1].length()) {
				if (num == c.length()) {
					break;
				} // end if
				c += str[0].charAt(i);
			} else if (i < num) {
				c += str[0].charAt(i);
			} else {
				if (c.length() == str[1].length()) {
					break;
				} // end if
				c += str[1].charAt(i);
			} // end if
		} // end for
		sc.close();
		System.out.println(c);
	} // end main

} // end class

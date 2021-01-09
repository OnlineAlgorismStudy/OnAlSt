package question.month11.day1125;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class bangJjo_1125 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String[] str = new String[2];

		int mul = 1;

		for (int i = 0; i < str.length; i++) {
			str[i] = sc.next();
		} // end for
		Pattern p = Pattern.compile("^[0-9]{1,}");

		for (int i = 0; i < str.length; i++) {
			Matcher m = p.matcher(str[i]);
			if (m.find()) {
				mul *= Integer.valueOf(m.group());
			} // end if
		} // end for
		System.out.println(mul);
		sc.close();
	} // end main
} // end class
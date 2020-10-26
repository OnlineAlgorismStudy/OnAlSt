package study;

import java.util.Scanner;

public class st_1026z {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while (true) {
			char str = sc.next().charAt(0);
			// A< str <Z || a<str<z 일 경우
			if ((str >= 65 && str <= 90) || (str >= 97 && str <= 122)) {
				System.out.println(str);
			} else {
				if (str >= 48 &&  str <= 57) { // 숫자일경우
					System.out.println((int) str);
				} else {// 그외의 경우
					break;
				}
			}
		}
	}

}

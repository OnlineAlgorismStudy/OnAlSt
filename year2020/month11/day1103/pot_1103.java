package study11;

import java.util.Scanner;

public class st_1103 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		//스트링 버퍼 하나 알아갑니다!!
		StringBuffer sb = new StringBuffer(sc.nextLine());
		int num;
		while (sb.length() !=1 ) {
			num = sc.nextInt();
			if((num-1) >= sb.length()) {
				sb.deleteCharAt(sb.length()-1);
			}else {
				sb.deleteCharAt(num-1);
			}
			System.out.println(sb);
		}

	}

}

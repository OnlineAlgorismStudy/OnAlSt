package study11;

import java.util.Scanner;

public class st_1116 {

	public static void main(String[] args) {
		//스트링 버퍼는 문자열 수정을 할때 메모리를 덜먹는데요 !
		StringBuffer str = new StringBuffer();
		Scanner sc = new Scanner(System.in);
		int s = 0;
		int e = 3;
		
		for (int i = 0; i < 5; i++) {
			str.append(sc.nextLine());
		}
		
		for (int i = 0; i <= (str.length()/3); i++) {
			if(e > str.length()) {
				e = str.length();
			}
			System.out.println(str.subSequence(s, e));
			s += 3;
			e += 3;
		}
		
	}

}

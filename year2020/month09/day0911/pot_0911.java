package study;

import java.util.Scanner;

public class stidy0911 {
	public void cal(int a) {
		int result = 0;
		// 입력받은 수까지 더해주자!
		for (int i = 1; i < a+1; i++) {
			result += i;
		}
		System.out.println(result);
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		stidy0911 st = new stidy0911();
		//정수 입력 및 함수 호출
		int data = sc.nextInt();
		st.cal(data);
	}

}

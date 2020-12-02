package study11;

import java.util.Scanner;

public class st_1125 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String num1 = sc.nextLine();
		String num2 = sc.nextLine();
		//정수만 출력해주기,공백을 기준으로 split 하고 0번째 인덱스만 추출
		int data1 = Integer.parseInt(num1.replaceAll("[^0-9]", " ").split(" ")[0]);
		int data2 = Integer.parseInt(num2.replaceAll("[^0-9]", " ").split(" ")[0]);
		int result = data1 * data2;
		System.out.println(result);
	}

}

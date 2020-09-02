package study_0824;

import java.util.Scanner;

public class test {
	public void RecTan(int a) {
		//가장 마지막 지점의 수 (4 * 4 > 16 / 5 * 5 > 25)
		int len = a * a;
		
		for (int i = 0; i < len; i++) {
			System.out.print(i+1+" ");
			//입력한 길이만큼 수를 출력했다면 개행
			if((i+1) % a ==0) {
				System.out.println("");
			}
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//메서드 사용을 위한 객체 생성
		test ForMet = new test();
		System.out.print("입력 : ");
		//데이터 입력 및 메서드 호출
		int data1 = sc.nextInt();
		ForMet.RecTan(data1);
	}
}

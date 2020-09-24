package study;

import java.util.ArrayList;
import java.util.Scanner;

public class st0924 {
	//Arraylist 이용해보기!
	public static void cal(ArrayList<Integer> list) {
		int result = 0;
		for (int i = 0; i < list.size(); i++) { //리스트 사이즈만큼 반복(5)
			result += Math.abs(list.get(i)); //하나씩 가져와서 양수로 전환 후 더하기
		}
		System.out.println(result);
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayList<Integer> list = new ArrayList<Integer>(); //리스트생성

		for (int i = 0; i < 5; i++) {
			list.add(sc.nextInt()); //차곡차곡 넣기
		}
		cal(list);//리스트전달
	}
}

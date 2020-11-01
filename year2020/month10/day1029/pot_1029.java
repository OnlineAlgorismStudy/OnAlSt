package study;

import java.util.Scanner;

public class st_1029 {

	public static void main(String[] args) {
		Scanner	sc = new Scanner(System.in);
		String str = sc.nextLine();
		String[] arr1 = str.split(""); //일단 단어를 하나씩 담자
		int count = 0;
		int num = str.length()-1;
		for (int i = 0; i < str.length(); i++) {//오른쪽회전
			for(int j = num-i;j<str.length();j++) {
				System.out.print(arr1[j]);
			}
			count++;
			 for (int j = 0; j < str.length()-count; j++) {//나머지출력
	                System.out.print(arr1[j]);
	            }
	            System.out.println();
		}
	}

}

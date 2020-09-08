package study;

import java.util.Scanner;

public class study0908 {

	int[] data = new int[2];
	
	public int[] cal(int a,int b) {
		
		if(a < b) {
			data[0] = a * 2;
			data[1] = b / 2;
		}else {
			data[0] = b * 2;
			data[1] = a / 2;
		}
		return data;
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		study0908 st = new study0908();
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c[]= st.cal(a, b);
		for (int i = 0; i < c.length; i++) {
			System.out.print(c[i]+" ");
		}
		

	}

}

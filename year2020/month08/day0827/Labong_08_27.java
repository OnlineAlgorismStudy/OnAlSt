package august;

public class Labong_08_27 {

	public static void main(String[] args) {
		
		int result = 0;
		int[][] num = {	{3, 5, 9},
				{2, 11 ,5},
				{8, 30, 10},
				{22, 5, 1}
			      };
		
		for(int i=0; i<4; i++) {
			for(int i2=0; i2<3; i2++) {
				System.out.print(num[i][i2] + " ");
				result += num[i][i2];
			}
			System.out.println();
		} //for
			System.out.println(result);
	} // main

}

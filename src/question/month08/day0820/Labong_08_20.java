package august;

public class Labong_08_20 {

	public static void main(String[] args) 
		
		int[][] num = {		{5, 8, 10, 6, 4},
							{11, 20, 1, 13, 2},
							{7, 9, 14, 22, 3}
					  }; 
		
		for(int i=0; i<num.length;i++) {
			for(int k=0; k<5;k++) {
				System.out.printf("%2d   ",num[i][k]);
			}
			System.out.println();
		}		
	} // 

}

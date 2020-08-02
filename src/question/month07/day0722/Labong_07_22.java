import java.util.Scanner;

public class Labong_07_22 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String use = "Y";
		int sum = (sc.nextInt()*2)-1;
		int count = 1;
		for(int i=0; i<sum;i++) {
			if(use.equals("Y")) {
				for(int k=0; k<count;k++) {
					System.out.print("*");
					if(count == (sum/2)+1) {
						use = "N";
					}
				}
			}else {
				for(int j=0; j<count;j++) {
					System.out.print("*");
				}
			}
			if(use.equals("Y")) {
				count++;
			}else {
				count--;
			}
			System.out.println("");
		}

	}

}

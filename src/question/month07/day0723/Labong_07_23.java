import java.util.Scanner;

public class Labong_07_23 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String use = "Y";
		int num = (sc.nextInt()*2)-1;
		int count = num;
		int count2 = 0;
		
		for(int i=0; i < num; i++) {
			
			for(int j=0; j < count2; j++) {
				System.out.print(" ");
			}
								
			for(int k=0; k < count;k++) {
				System.out.print("*");
				if(count == 1) {
					use = "N";
				}
			}
			if(use.equals("Y")) {
				count2++;
				count -= 2;
			}else {
				count2--;
				count += 2;
			}
			System.out.println("");
		}

	}

}

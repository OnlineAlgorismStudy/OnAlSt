import java.util.Scanner;

public class Labong_07_29 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		int num = sc.nextInt();
		int count = 1;
		String use = "N";
		
		for(int i=0; i < (num*2)-1; i++) {
			
			if(use.equals("N")) {
				for(int k=1; k <= count; k++) {
					System.out.print("# ");		
				}
				if(count == num) {
					use = "Y";
					count = 1;
					System.out.println("");
					continue;
				}
			}else {
				for(int a=1; a <= count; a++) {
					System.out.print("  ");
				}
				for(int b=0; b< num-count; b++) {
					System.out.print("# ");
				}
			}	
			count ++;
			System.out.println("");
		} // for
		
	} // main

}

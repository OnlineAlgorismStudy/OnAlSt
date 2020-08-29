import java.util.Scanner;

public class Labong_07_24 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int num = (sc.nextInt()*2)-1;
		int count = num-1;
		int count2 = 1;
		 
				
		for(int i=0; i<(num/2)+1; i++) {
			
			for(int a=0; a< count; a++) {
				System.out.print(" ");
			}
			
			for(int k=0; k < count2; k++) {
				System.out.print("*");
			}
			count -= 2;
			count2 += 2;
			System.out.println("");
		}
				
				
	} 

}

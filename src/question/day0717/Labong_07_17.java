import java.util.Scanner;

public class Labong_07_17 {

	public static void main(String[] args) {
		
			Scanner sc = new Scanner(System.in);
			System.out.print("search: ");
			int num = sc.nextInt();
			
			int start = 1;
			int num2 = (num * 2)-1;
			sc.close();
			
			for(int i = 0; i < num; i++) 
			{
				
				for(int j = 0; j<i; j++) 
				{
					System.out.print(" ");				
				}
				
				for(int k=0;k<num2;k++) 
				{
					System.out.print("*");
				}
				
				num2 -= 2;				
				System.out.println("");
			}				

	} // main

}

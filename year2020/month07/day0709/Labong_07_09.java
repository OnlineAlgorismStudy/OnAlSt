import java.util.Scanner;

public class Labong_07_09 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
				
		 while(true) {
			 
			 System.out.print("Base = ");
			 int Base = sc.nextInt();
			 
			 System.out.print("Height = ");
			 int Height = sc.nextInt();
			 //double width = (Base * Height)/2;
			 System.out.println("Triangle width = " +(double)(Base * Height)/2);	
			 
			 System.out.print("Continue? ");
			 String use = sc.next();
			 
			 if(!("Y".equals(use) || "y".equals(use))) {
				 break;
			 }			 
		 }
		 	 sc.close();
		 	 
	}
}
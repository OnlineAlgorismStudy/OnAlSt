import java.util.Scanner;

public class bangJjo_0908 {
	
	public static int result1(int num1, int num2) {
		
		if(num1 > num2) {
			 return num1 / 2;
		}else {
			return num1 * 2; 
		} // end if
		
	} // result
	
	public static int result2(int num1, int num2) {
		
		if(num2 > num1) {
			 return num2 / 2;
		}else {
			return num2 * 2; 
		} // end if
		
	} // result
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		sc.close();
		System.out.println(result1(num1, num2) + " " + result2(num1, num2));
		
	} // main

} // class
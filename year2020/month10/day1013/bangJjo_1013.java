import java.util.Scanner;

public class bangJjo_1013 {

	public static int result(int num) {
		if(num == 2) {
			return 2;
		} else if(num == 1) {
			return 1;
		} // end if
		
		return (result(num-1) * result(num-2))%100;
		
	} // result
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		int num = sc.nextInt();
		
		sc.close();
		
		System.out.println(result(num));
		
	} // main

} // class

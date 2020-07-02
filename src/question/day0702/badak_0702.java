package homework;

import java.util.Scanner;

public class badak_0702 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		System.out.printf("yard? ");
		double yd = sc.nextDouble();

		System.out.printf("%4.1fyard = %4.1fcm\n", yd, changeCm(0,yd));
	}
	
	public static double changeCm(int type, double data) {
		//@EXP type 0 => yard , type 1 => inch
		double result;
		if(type==0) {
			result = data * 91.44;
		}else {
			result = data * 2.54;
		}
		return result;
	}

}

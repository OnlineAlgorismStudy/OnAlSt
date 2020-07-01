import java.text.DecimalFormat;

public class Labong_07_01 {

	public static void main(String[] args) {
		
		Float yd =  91.44F;
		Float inch = 2.54F;
		
		System.out.printf("2.1yd = "+ "%.1fcm \n" , (yd * 2) + (yd / 10));
		
		System.out.println("10.5in = " + Math.round((inch*10.5) * 10) / 10.0 + "cm");
		
	}

}

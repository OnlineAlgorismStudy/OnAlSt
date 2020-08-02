package question.day0701;

public class bangJjo_0701 {

	public static void main(String[] args) {
		
		double yd = 91.44;
		double in = 2.54;
		double resultA = 2.1*yd;
		double resultB = 10.5*in;
		
		System.out.println(" 2.1yd = "+Math.round(resultA*10)/10.0+"cm");
		System.out.println("10.5in =  "+Math.round(resultB*10)/10.0+"cm");
		
	}

} // class

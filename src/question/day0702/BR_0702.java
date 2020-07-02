import java.util.Scanner;

public class BR_0702 {

	public static void main(String[] args) {

		double yd = 91.44;
		Scanner sc = new Scanner(System.in);

		System.out.print("yard? ");
	    Double x = sc.nextDouble();
	    sc.close();
	    
	    System.out.println(x + "yard = " + String.format("%.1f", Math.round(yd*x*100)/100.0) + "cm");

	}

}

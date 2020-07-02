
import java.util.Scanner;

public class Labong_07_02 {

	public static void main(String[] args) {
		
		Double yard = 91.44;
		
		Scanner sc = new Scanner(System.in);
		System.out.print("yard? ");
		Double input = sc.nextDouble();
		
		System.out.println(input + "yard = " + Math.round((yard * input) * 10) / 10.0 + "cm");
		
		sc.close();
	}

}

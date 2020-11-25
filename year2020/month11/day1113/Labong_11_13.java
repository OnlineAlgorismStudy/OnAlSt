import java.text.Format;
import java.util.Scanner;


public class Labong_11_13 {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();

		String arr[] = str.split("\\.");
		str = str.replaceAll("[^0-9,\\.]","");
		Double drr = Double.parseDouble(str);
		
		System.out.println(Integer.parseInt(arr[0])*2);
		System.out.printf("%.2f",Math.round(drr*100)/100.0);
		
	}

}

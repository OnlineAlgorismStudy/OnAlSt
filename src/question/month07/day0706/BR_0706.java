import java.util.Scanner;

public class BR_0706 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

	    int year = sc.nextInt();
	    sc.close();
	    
	    if (isLeap(year)) {
	    	System.out.println("leap year");
	    } else {
	    	System.out.println("common year");
	    }
	}
	
	private static boolean isLeap(int year) {
		boolean bLeap = false;
		if (year % 400 == 0 || (year % 4 == 0 && year % 100 != 0)) bLeap = true;
		
		return bLeap;
	}

}

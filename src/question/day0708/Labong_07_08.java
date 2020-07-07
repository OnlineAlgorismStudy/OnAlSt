import java.util.Scanner;

public class Labong_07_08 {
	
	public static String result(int number) {
				
		String country = "";
		
		if(number == 1) {
			country = "seoul";
		}else if(number == 2) {
			country = "Washington";
		}else if(number == 3) {
			country = "Tokyo";
		}else if(number == 4){
			country = "Beijing";
		}else {
			country = "none";
		}		
		return country;			
	}
	
	public static void main(String[] args) {
		
			Scanner sc = new Scanner(System.in);				
							
			while(true) {
				
			System.out.print(	"1. Korea\n"
					  + "2. USA\n"
					  + "3. Japan\n"
					  + "4. China\n"
					);
			int number = sc.nextInt();
			
			String result = result(number);		
			System.out.println(result + "\n");
			
			if("none".equals(result)) {
				break;
			}
		}
	
	}

}

package homework;

import java.util.Scanner;

public class badak_0708 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			System.out.println("1. Korea");
			System.out.println("2. USA");
			System.out.println("3. Japan");
			System.out.println("4. China");
			System.out.print("number? ");
			String a = sc.next();
			
			System.out.println("");
			
			if("1".equals(a)) {
				System.out.println("Seoul\n");
			}else if("2".equals(a)) {
				System.out.println("Washington, D.C\n");
			}else if("3".equals(a)) {
				System.out.println("Tokyo\n");
			}else if("4".equals(a)) {
				System.out.println("Beijing\n");
			}else {
				System.out.println("none");
				break;
			}
		}
	}
}


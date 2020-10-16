package october;

import java.util.Scanner;

public class Labong_10_15 {

	static int good = 1;
	static String result = "";
	static int count = 1;
	
	static int mul = 1;
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int s1 = sc.nextInt();
		int s2 = sc.nextInt();
		int s3 = sc.nextInt();

		System.out.println(something((s1*s2*s3),0));
	}

	static int something(int s1, int use) {
		
		
		if( count == 0) {
			return good;
		}else {
			if(use == 0) {
				result = Integer.toString(s1).replaceAll("0","");
				count = result.length();
			}
			good *=  Integer.parseInt(result.substring(use,use+1));
			count --;
			return something(0,use+1);	
		}	// else AND
	} // something() AND
}

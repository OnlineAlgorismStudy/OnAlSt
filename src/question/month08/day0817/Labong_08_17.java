package august;

import java.util.Scanner;

public class Labong_08_17 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int[] num = new int[100];
		int count = 0;
		String result = "";
		
		for(int i=0; i<num.length; i++) {
			num[i] = sc.nextInt();
			
			if(num[i] == 0) {break;}
			
			if(num[i] %2 == 0) {
				num[i] = num[i]/2;
				result += num[i]+" ";
				count++;				
			}else{
				num[i] = num[i]*2;
				result += num[i]+" ";
				count++;
			}
		}				
		System.out.println(count + "\n"+result);
	}

}

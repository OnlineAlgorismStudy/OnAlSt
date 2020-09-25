package september;

import java.util.Scanner;

public class Labong_09_25 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		result(sc.nextInt());

	}
	
	static void result(int num){
		
		int sum = 0;
		
		for(int i=0; i<num; i++) {
			if(sum ==0) {sum += 2;}
			else {sum *= 2;}	
		}
		System.out.println(sum);
	}
	

}

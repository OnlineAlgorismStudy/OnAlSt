package september;

import java.util.Scanner;

public class Labong_09_21 {

	
	
	static void result(int[] arr) {
		
		 int please = 0;
		
		for(int a=0; a<arr.length; a++) {
			for(int a2=0; a2<arr.length-1; a2++) {
				if(arr[a2] < arr[a2+1]) {
					please = arr[a2];
					arr[a2] = arr[a2+1];
					arr[a2+1] = please;
				}
			}
			
			for(int a3=0; a3<arr.length; a3++) {
				System.out.print(arr[a3]+" ");
			}
			System.out.println();
		} 
		
	}


	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] arr = new int[10];
		
		for(int i=0; i<arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		
		sc.close();
		result(arr);
	}

}

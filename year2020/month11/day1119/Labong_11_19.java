package november;

import java.util.Scanner;

public class Labong_11_19 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int count=0;
		String[] arr = new String[50];
		
		for(int i=0; i<50;i++) {
			arr[i] = sc.next();
			if(arr[i].equals("0")) { arr[i] = null; break; } 
		}

		for(int k=0; k<50; k++) {
			if(arr[k] != null && arr[k] != "0") {
				if(k % 2 == 0) {
					System.out.println(arr[k]);
					count++;
				}else {
					count++;
				}
			}
		}
		System.out.println(count);
	}

}

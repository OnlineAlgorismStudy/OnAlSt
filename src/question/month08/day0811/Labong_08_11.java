package august;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Labong_08_11 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		Integer[] num = new Integer[10];
		String result = "";
		
		for(int i=0; i< num.length; i++) {
			num[i] = sc.nextInt();
		}
		
		Arrays.sort(num, Collections.reverseOrder());
		result = Arrays.toString(num);		
		result = result.replaceAll("\\[", "").replaceAll("\\]","").replaceAll("\\,","");
		
		System.out.println(result);
		

	}

}

package august;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class Labong_08_25 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int[] student = new int[100];
		int num = 0;
		Map<Integer, Integer> map = new HashMap<Integer, Integer>();
		
		for(int i=0; i<100; i++) {
			num = (sc.nextInt()/10)*10;
			
			if(num == 0) { break; }
			for(int i2 = 0; i2 <= 10; i2++) {
				if(i2 == num/10) {
					student[i2]++;
				}
			}
				for(int i3 =0; i3<10; i3++) {
					map.put(i3 * 10, student[i3]);
				}
			}
		
		for(Integer k=100; k>=0;k-=10) {
			for(int ele : map.keySet()){
				if(k == ele && map.get(k) != 0 ) {	
					System.out.println(+ele + " : " + map.get(k) + "person");
				}
			}			
		}	
							
		
	} // main

}

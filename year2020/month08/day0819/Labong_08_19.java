package august;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class Labong_08_19 {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		Map<String, Integer> map = new HashMap<String, Integer>();
		List<String> list = new ArrayList<String>();
		String[] str = null;
		int count = 0;
		
	dong:while(true) {
					
			for(int i=0; i<=count;i++) {
							
				list.add(sc.next());
				
				if(!list.get(i).matches(".*[A-Z].*")) {
					list.remove(i);
					break dong; 
				}
				count++;	
			}				 	 			
		} // while
		
		str = new String[list.size()];
	
		for(int aa=0; aa<list.size();aa++) {
			str[aa] = list.get(aa);		
		}
		
		for(String key : str) {
			map.put(key, map.getOrDefault(key, 0)+1);
		}
		String result = map.toString();
		
		result = result.replaceAll("\\{","")
					   .replaceAll("\\}","")
					   .replaceAll("\\,","\n")
					   .replaceAll("="," : ");
		
			System.out.println(" " +result);
	}

}

import java.util.Scanner;


public class Labong_11_18 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String str = sc.next();
		String[] strArr = {"flower","rose","lily","daffodil","azalea"};
		int count = 0;
		boolean use = false;
		
		for(int j=0; j<strArr.length; j++) {
			use = strArr[j].substring(1,3).contains(str);
			if(use) { System.out.println(strArr[j]); count++;}
		}
		System.out.println(count);
	}

}

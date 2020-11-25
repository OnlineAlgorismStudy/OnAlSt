import java.util.Scanner;


public class Labong_11_18 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String str = sc.next();
		String[] strArr = {"flower","rose","lily","daffodil","azalea"};
		int count = 0;
		for(int i=0; i<strArr.length;i++){
			if(strArr[i].contains(str)){
				System.out.println(strArr[i]);
				count++;
			}
		}
		System.out.println(count);
	}

}

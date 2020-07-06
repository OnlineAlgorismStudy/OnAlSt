import java.util.Scanner;

public class Labong_07_07 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("번호 입력: ");
		int number = sc.nextInt();
		
		switch(number){
		case 1 :
			System.out.println("Dog");
			break;
		case 2 :
			System.out.println("cat");
			break;
		case 3 :
			System.out.println("chicken");
			break;
		default :
			System.out.println("I don't know");
			break;	
		}
		
		  
	}
}

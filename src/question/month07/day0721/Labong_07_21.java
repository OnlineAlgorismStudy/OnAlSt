import java.util.Scanner;

public class Labong_07_21 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("search: ");
		int num = sc.nextInt();
		
		int count2 = 1; 
		int count = 1;
		char ch = 65;
						
		for(int i=0; i <num; i++) {
			for(int k=0; k <num-i;) {
				System.out.print(count);
				k++;
				if(k == num-i) {
					for(int a=0; a<count2;a++) {
						System.out.print(ch);
						ch++;
					}
				}
				count++;
			}		
			count2++;
			System.out.println("");
		}
		
		

	}

}

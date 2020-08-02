import java.util.Scanner;

public class Labong_07_20 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("search: ");
		int num = sc.nextInt();
		String result = "";
		char ch = 65;
		int count = 0;
		for(int i=0; i < num; i++) {
			for(int k=0; k <(num-count);k++ ) {
				result += ch;
				ch++;
			}
			count++;
			result += "\n";
		}
		System.out.println(result);
		
	}
}

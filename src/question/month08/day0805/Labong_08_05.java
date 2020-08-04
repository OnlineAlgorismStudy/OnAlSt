import java.util.Scanner;

public class Labong_08_05 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		Double[] ban = {85.6, 79.5, 83.1, 80.0, 78.2, 75.0};
		
		int num = sc.nextInt()-1;		
		int num2 = sc.nextInt()-1;
		Double result = 0.0;
		
		for(int i=0; i<ban.length;i++) {
			if(i == num || i == num2) {
				result += ban[i];
			}
		}
			System.out.println(result);
	}

}

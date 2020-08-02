import java.util.Scanner;

public class Labong_07_31 {

	static void calculator1(int num1,int num2) {
		
		for(int i = 1; i <= 9; i++){
            for(int k = num1; k <= num2; k++){
                System.out.print( k + " * " + i + " = ");
                System.out.printf("%3d", (k*i));
                System.out.printf("%3s", "");
            }
            System.out.println("");       
		}
	}
	
	static void calculator2(int num1,int num2) {
		
		for(int i = 1; i <= 9; i++){
            for(int k = num1; k >= num2; k--){
                System.out.print( k + " * " + i + " = ");
                System.out.printf("%3d", (k*i));
                System.out.printf("%3s", "");
            }
            System.out.println("");
		}
		
	}
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		
		while(true) {
			if(num1 < 2 || num1 > 9 || num2 < 2 || num2 > 9) {
				System.out.println("INPUT ERROR!");
				num1 = sc.nextInt();
				num2 = sc.nextInt();
				continue;
			}else if(num1 < num2) {
				calculator1(num1,num2);
				break;
			}else {
				calculator2(num1,num2);
				break;
			}
			
		}
		
		
	}

}

import java.util.Scanner;

public class bangJjo_0902 {

	public static void print() {
		
		Scanner sc = new Scanner(System.in);
		double radius = sc.nextDouble();
		double pi = 3.14;
		double area = radius * radius * pi;
		System.out.printf("%.2f",area);
		sc.close();
	} // print
	
	public static void main(String[] args) {
		
		print();
		
	} // main
} // class

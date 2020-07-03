import java.util.Scanner;

public class Labong_07_03 {

	public static void main(String[] args) {
	
		   // 직사각형의 가로와 세로의 길이를 정수형 값으로 입력받은 후 가로의 길이는 5증가시키고 
		   // 세로의 길이는 2배하여 저장한 후 ( 가로, 세로 넓이 ) 를 차례로 출력하는 프로그램을 작성하시오.		
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("width: ");
		int width = sc.nextInt() + 5;
		
		System.out.print("length: ");
		int length = sc.nextInt() * 2;
		
		System.out.println("==============");
		
		System.out.println("width: " + width + "\nlength: " + length + "\narea: " + (width * length));
		
	}
}

import java.util.Scanner;

public class Labong_07_03 {

	public static void main(String[] args) {
	
		   // ���簢���� ���ο� ������ ���̸� ������ ������ �Է¹��� �� ������ ���̴� 5������Ű�� 
		   // ������ ���̴� 2���Ͽ� ������ �� ( ����, ���� ���� ) �� ���ʷ� ����ϴ� ���α׷��� �ۼ��Ͻÿ�.		
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("width: ");
		int width = sc.nextInt() + 5;
		
		System.out.print("length: ");
		int length = sc.nextInt() * 2;
		
		System.out.println("==============");
		
		System.out.println("width: " + width + "\nlength: " + length + "\narea: " + (width * length));
		
	}
}

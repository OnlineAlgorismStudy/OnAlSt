import java.util.Scanner;

public class BR_0903 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int size = 100;
		
		while (size >= 100) {
			size = sc.nextInt();
		}
		
		sc.close();
		
		int i = 0;
		while (i < size*size) {
			System.out.print(++i);
			if (i % size == 0) System.out.println();
			else System.out.print(" ");
		}

	}

}

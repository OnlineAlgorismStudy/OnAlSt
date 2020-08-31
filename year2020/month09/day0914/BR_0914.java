import java.util.Scanner;

public class BR_0914 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int size = sc.nextInt();
		for (int i = 1; i <= size; i++) {
			String line = "";
			for (int j = 1; j <= size; j++) {
				line += i*j;
				if (j < size) line += " ";
			}
			System.out.println(line);
		}
		
		sc.close();
	}

}

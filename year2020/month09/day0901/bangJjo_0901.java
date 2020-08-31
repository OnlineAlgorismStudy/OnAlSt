import java.util.Scanner;

public class bangJjo_0901 {

	public static void print() {

		Scanner sc = new Scanner(System.in);
		int num = 0;
		num = sc.nextInt();

		if (num > 0) {
			for (int i = 0; i < num; i++) {
				System.out.println("~!@#$^&*()_+|");
			} // end for
		} // end if

		sc.close();
	} // method

	public static void main(String[] args) {

		print();

	} // main
} // class

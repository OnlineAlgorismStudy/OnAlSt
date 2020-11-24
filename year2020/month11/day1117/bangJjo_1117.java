import java.util.Scanner;

public class bangJjo_1117 {

	public static void main(String args[]) {

		Scanner sc = new Scanner(System.in);

		String input = sc.nextLine();

		String[] arr = input.split(" ");

		for (int i = arr.length - 1; i >= 0; i--) {

			System.out.println(arr[i]);

		} // end for
		sc.close();
	} // main

} // class

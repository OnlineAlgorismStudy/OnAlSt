import java.util.Scanner;

public class bangJjo_1118 {

	public static void main(String args[]) {

		Scanner sc = new Scanner(System.in);

		char input = sc.next().charAt(0);

		String[] arr = { "flower", "rose", "lily", "daffodil", "azalea" };

		int count = 0;

		for (int i = 0; i < arr.length; i++) {

			for (int j = 1; j <= 2; j++) {

				if (arr[i].charAt(j) == input) {

					System.out.println(arr[i]);

					count++;

				} // end if

			} // end for

		} // end for

		System.out.println(count);

	} // main

} // class
​


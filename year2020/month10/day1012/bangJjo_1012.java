
import java.util.Scanner;

public class Main {

	static int cnt = 0;
	static int arr[] = new int[10];

	public static void result(int num1, int num2) {

		for (int i = 1; i <= 6; ++i) {
			arr[cnt] = i;
			if (cnt == num1 - 1) {
				int total = 0;
				for (int j = 0; j <= cnt; ++j) {

					total += arr[j];
				} // end for
				if (total == num2) {
					for (int k = 0; k < num1; ++k) {
						System.out.print(arr[k] + " ");
					} // end for
					System.out.println();
				} // end if
			} else {
				cnt++;
				result(num1, num2);
				cnt--;
			} // end if
		} // end for

	} // result

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num1 = 0;
		int num2 = 0;
		Scanner sc = new Scanner(System.in);
		num1 = sc.nextInt();
		num2 = sc.nextInt();
		sc.close();
		result(num1, num2);

	} // main

} // class

import java.util.Scanner;

public class Main {

	public static int multiplication(int result) {
		if (result == 0) {
			return 1;
		} // end if

		int i = 1;
		i = result % 10;

		if (i == 0) {
			i = 1;
		} // end if
		result = result / 10;

		return (i * multiplication(result));
	} // multiplication

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		int num3 = sc.nextInt();

		sc.close();

		int result = num1 * num2 * num3;

		System.out.println(multiplication(result));

	} // main

} // class

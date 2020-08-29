package homework;

import java.util.Scanner;

public class badak_0710 {

	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);

		int n = Integer.parseInt(sc.nextLine());
		if(n > 10) {
			throw new Exception("과목이 10보다 큽니다");
		}
		String a[] = sc.nextLine().split(" ");
		Double sum = 0.0;
		for (int i = 0; i < n; i++) {
			sum += Double.parseDouble(a[i]);
		}
		Double avg = sum / n;
		System.out.println("avg : " + (Math.round(avg*10)/10.0));
		System.out.println(avg < 80 ? "fail" : "pass");
	}
}

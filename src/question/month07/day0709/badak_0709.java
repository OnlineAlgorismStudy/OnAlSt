package homework;

import java.util.Scanner;

public class badak_0709 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		while (true) {
			System.out.print("Base = ");
			Double base = sc.nextDouble();

			System.out.print("Height = ");
			Double height = sc.nextDouble();

			System.out.println("Triangle width = " + Math.round(((base * height) / 2) * 10) / 10.0);

			System.out.print("Continue? ");
			String a = sc.next();
			if (!("y".equals(a) || "Y".equals(a))) {
				break;
			}
		}
	}
}

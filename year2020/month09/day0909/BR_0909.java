import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BR_0909 {

	public static void main(String[] args) {
		List<Integer> listDan = new ArrayList<Integer>();
		Scanner sc = new Scanner(System.in);
		
		int temp1 = sc.nextInt();
		int temp2 = sc.nextInt();
		
		while (temp1 < 1 || temp1 > 10) {
			temp1 = sc.nextInt();
		}
		while (temp2 < 1 || temp2 > 10) {
			temp2 = sc.nextInt();
		}
		
		if (temp1 == temp2) listDan.add(temp1);
		else {
			listDan.add(Math.min(temp1, temp2));
			listDan.add(Math.max(temp1, temp2));
		}
		
		sc.close();
		
		while (listDan.size() < Math.abs(temp1 - temp2) + 1) listDan.add(1, listDan.get(1) - 1);
		for (int dan : listDan) System.out.println(printGugudan(dan));
	}

	private static String printGugudan (int dan) {
		String gugudan = "== " + dan + "dan ==\n";
		
		for (int i = 1; i <= 9; i++) {
			gugudan += dan + " * " + i + " = " + String.format("%2s", dan*i) + "\n";
		}
		
		return gugudan;
	}
}

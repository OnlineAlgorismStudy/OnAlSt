import java.util.Scanner;

public class BR_0917 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int size = sc.nextInt();
		while (size < 1 || size > 10) size = sc.nextInt();
		int[] ary = new int[size];
		
		for (int i = 0; i < size; i++) {
			ary[i] = sc.nextInt();
		}
		sc.close();
		
		String strAry = "";
		for (int i : sortDesc(ary)) {
			strAry += i + " ";
		}
		System.out.println(strAry.trim());
	}
	
	private static int[] sortDesc(int[] ary) {
		for (int i = 0; i < ary.length-1; i++) {
			for (int j = i+1; j < ary.length; j++) {
				if (ary[i] < ary[j]) {
					int tmp = ary[i];
					ary[i] = ary[j];
					ary[j] = tmp;
				}
			}
		}
		return ary;
	}

}

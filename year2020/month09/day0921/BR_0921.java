import java.util.Scanner;

public class BR_0921 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] ary = new int[10];
		for (int i = 0; i < 10; i++) {
			ary[i] = sc.nextInt();
		}
		sc.close();
		
		for (int i = 0; i < 9; i++) {
			for (int j = 0; j < 9-i; j++) {
				if (ary[j] < ary [j+1]) {
					int tmp = ary[j];
					ary[j] = ary[j+1];
					ary[j+1] = tmp;
				}
			}
			String step = "";
			for (int num : ary) {
				step += num + " ";
			}
			System.out.println(step.trim());
		}
	}

}

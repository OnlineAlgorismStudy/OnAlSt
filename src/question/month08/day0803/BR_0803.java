import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BR_0803 {

	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		
		List<String> result = new ArrayList<String>();
		while (result.size() < 10) {
			String[] input = sc.nextLine().replaceAll(" ", "").split("");
			for (String s : input) {
				result.add(s);
			}
		}
		System.out.println(result.get(0) + " " + result.get(3) + " " + result.get(6));
		
        sc.close();
    }
}

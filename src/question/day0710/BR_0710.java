import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class BR_0710 {

	public static void main(String[] args) {
		/* **************************************************
		 * 문제.
		 * 10 이하의 과목수 n이 주어진다.
		 * 
		 * 정수로 주어진 n개 과목의 점수를 입력받아서 실수 평균을 구하여 출력하고
		 * 
		 * 평균이 80점이상이면 "pass", 80점 미만이면 "fail"이라고 출력하는 프로그램을 작성하시오.
		 * 
		 * 
		 * 평균은 반올림하여 소수 첫째자리까지 출력한다.​​​
		 * 
		 * 입력 예.
		 * ===========================
		 * 4
		 * 75 80 85 90
		 * ===========================
		 * 
		 * 출력 예.
		 * ===========================
		 * avg : 82.5
		 * pass
		 * ===========================
		 * **************************************************/

		Scanner sc = new Scanner(System.in);
		int subjCnt = sc.nextInt();
		List<Integer> scores = new ArrayList<Integer>();
		
		for (int i = 0; i < subjCnt; i++) {
			scores.add(sc.nextInt());
		}
		
		Map<String, Object> results = getResult(scores);
		System.out.println("avg : " + results.get("avg"));
		System.out.println(results.get("result"));
		
	    
	    sc.close();
	}
	
	
	private static Map<String, Object> getResult(List<Integer> scores) {
		Map<String, Object> results = new HashMap<String, Object>();
		int total = 0;
		int count = scores.size();
		
		for(int score : scores) {
			total += score;
		}
		
		results.put("avg", String.format("%.1f", (double)total/(double)count));
		if (total/count >= 80) results.put("result", "pass");
		else results.put("result", "fail");
		
		return results;
	}
}

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Labong_07_10 {
				
	public static void main(String[] args) {
		/* 
		 * 10 이하의 과목수 n이 주어진다.
		 * 정수로 주어진 n개 과목의 점수를 입력받아서 실수 평균을 구하고 출력하고
		 * 평균이 80점 이상이면 "pass" 80점 미만이면 "fail" 출력하는 프로그램 작성
		 * 
		 * 평균은 반올림하여 소수 1번째 자리까지 출력
		 * */
		List<Integer> list = new ArrayList<Integer>();
		
		Scanner sc = new Scanner(System.in);
		
		int sum = 0;
		System.out.print("과목수: ");
		int subject = sc.nextInt();
				
			if(subject > 10) {
				
				System.out.println("과목수가 초과되었습니다.");									
			}else {
					
			
			for(int i = 1; i <= subject; i++) {
				System.out.print("과목"+i+"점수:");
				int Score = sc.nextInt();
				list.add(Score);
			}
			
			for(int a = 0; a < list.size(); a++) {
				sum += list.get(a);
			}
				
			if(sum/list.size() >= 80) {
				System.out.println("avg: "+ (double)sum/list.size());
				System.out.println("pass");
			}else {
				System.out.println("avg: "+ (double)sum/list.size());
				System.out.println("fail");
			}
			
		}	
			
		
	}

}

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Labong_07_10 {
				
	public static void main(String[] args) {
		/* 
		 * 10 ������ ����� n�� �־�����.
		 * ������ �־��� n�� ������ ������ �Է¹޾Ƽ� �Ǽ� ����� ���ϰ� ����ϰ�
		 * ����� 80�� �̻��̸� "pass" 80�� �̸��̸� "fail" ����ϴ� ���α׷� �ۼ�
		 * 
		 * ����� �ݿø��Ͽ� �Ҽ� 1��° �ڸ����� ���
		 * */
		List<Integer> list = new ArrayList<Integer>();
		
		Scanner sc = new Scanner(System.in);
		
		int sum = 0;
		System.out.print("�����: ");
		int subject = sc.nextInt();
				
			if(subject > 10) {
				
				System.out.println("������� �ʰ��Ǿ����ϴ�.");									
			}else {
					
			
			for(int i = 1; i <= subject; i++) {
				System.out.print("����"+i+"����:");
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

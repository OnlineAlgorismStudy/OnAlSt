package onalst;

import java.util.Scanner;

public class badak_0818 {
	/*
	 * 0818
	 * 
	 * 20 ������ ���� n�� �Է¹ް� n���� ������ �Է¹޾� ���� �������� ���ʷ� ����ϴ� ���α׷��� �ۼ��Ͻÿ�.
	 * 
	 * 
	 * -�Է� �� 5 35 10 35 100 64
	 * 
	 * -��� �� 100 64 35 35 10
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int subjectCnt = sc.nextInt();
		int[] scores = new int[subjectCnt];

		for (int i = 0; i < subjectCnt; i++) {
			scores[i] = sc.nextInt();
		}
		sc.close();
		
		for (int i = 0; i < subjectCnt; i++) {
			for (int j = i + 1; j < subjectCnt; j++) {
				if (!(scores[i] > scores[j])) {
					int temp = scores[i];
					scores[i] = scores[j];
					scores[j] = temp;
				}
			}
		}
		
		for (int i = 0; i < subjectCnt; i++) {
			System.out.print(scores[i]+" ");
		}

	}

}

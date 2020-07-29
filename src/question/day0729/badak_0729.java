package homework;

import java.util.Scanner;

public class badak_0729 {

	/*
0729

자연수 n을 입력받아 "출력 예"와 같이 공백으로 구분하여 출력되는 프로그램을 작성하시오.
주의! '#'은 공백으로 구분하되 줄사이에 빈줄은 없다.

- 입력 예
3
- 출력 예
#
# #
# # #
  # #
    #
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		sc.close();

		
		for(int i = -a+1; i<a;i++) {
			if(i <= 0) {
				for(int j = i;j>-a;j--) {
					System.out.print("# ");
				}			
			}else {
				for(int j = 0;j<i;j++) {
					System.out.print("  ");
				}		
				for(int j = i;j<a;j++) {
					System.out.print("# ");
				}		
			}
			System.out.println("");
		}
	
	}
}

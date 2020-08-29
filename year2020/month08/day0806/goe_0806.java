package OAS;

import java.util.Scanner;

public class goe_0806 {
    public static void main(String[] args) {

        int[] array = new int[10];

        int num, min = 1000;

        Scanner sc = new Scanner(System.in);

        for(int i = 0; i < array.length; i++){
            num = sc.nextInt();
            if( num <= 1000) {
                array[i] = num;
            } else {
                System.out.println("1000 이하의 정수를 입력하시오.");
                System.exit(0);
            }
            
            // array[0] -> min 으로 수정. 어떤 수가 오든 배열의 첫번째 항목과 비교를 하게 되어 제대로 된 최소값을 얻지 못 함을 알게됨.
            if( array[i] <= min)
            min = array[i];
        }
        System.out.print(min);

        sc.close();
    }
}

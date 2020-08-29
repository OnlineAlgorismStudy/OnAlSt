package OAS;

import java.util.Scanner;

public class goe_0817 {
    public static void main(String[] args) {

        // 홀수는 2로 곱하기, 짝수는 2로 나누기
        int[] array = new int[100];

        int num, cnt = 0;

        Scanner sc = new Scanner(System.in);

        for(int i = 0; i < array.length; i++){
            num = sc.nextInt();

            if(num == 0){
                break;
            }

            cnt++;

            if(num % 2 != 0) {
                array[i] = (num * 2);
            }else if(num % 2 == 0){
                array[i] = (num / 2);
            }
        }

        sc.close();

        System.out.println(cnt);
        for(int i = 0; i < array.length; i++) {
            if(array[i] == 0){
                break;
            }
            System.out.print(array[i] + " ");
        }
    }
}

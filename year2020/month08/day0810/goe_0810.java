package OAS;

import java.util.Scanner;

public class goe_0810 {
    public static void main(String[] args) {

        // 짝수는 합, 홀수는 평균
        int[] array = new int[10];
        int num, sum_odd = 0, sum_even = 0;
        double avg;

        Scanner sc = new Scanner(System.in);


        for(int i = 0; i < array.length; i++){
            num = sc.nextInt();
            array[i] = num;

            if((i+1) % 2 == 0 ){
                sum_even += array[i];
            }else {
                sum_odd += array[i];
            }
        }

        sc.close();

        avg = sum_odd/(double)(array.length/2);

        System.out.println("sum: " + sum_even);
        System.out.print("avg :" + Math.round(avg*100)/100.0);
    }
}

package OAS;

import java.util.Scanner;

public class goe_0814 {
    public static void main(String[] args) {

        int[] array = new int[100];

        int num, cnt = 0, sum = 0;
        double avg;

        Scanner sc = new Scanner(System.in);

        for(int i = 0; i < array.length; i++){
            num = sc.nextInt();

            if(num == 0){
                break;
            }

            array[i] = num;

            if(array[i] % 5 == 0){
                sum += array[i];
                cnt++;
            }
        }
        sc.close();

        avg = (double)sum/cnt;

        System.out.println("Multiples of 5: " + cnt);
        System.out.println("sum: " + sum);
        System.out.println("avg: " + String.format("%.1f", avg));
    }
}

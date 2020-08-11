package OAS;

import java.util.Scanner;

public class goe_0812 {
    public static void main(String[] args) {

        int[] array = new int[10];

        int sum_odd = 0, sum_even = 0;

        Scanner sc = new Scanner(System.in);

        for(int i = 0; i < array.length; i++){

            array[i] = sc.nextInt();

            if(i%2 == 0){
                sum_odd += array[i];
            } else {
                sum_even += array[i];
            }
        }

        sc.close();

        System.out.println("odd: " + sum_odd);
        System.out.println("even: " + sum_even);

    }
}

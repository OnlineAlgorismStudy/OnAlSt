package OAS;

import java.util.Scanner;

public class goe_0805 {
    public static void main(String[] args) {

        double[] score_arr = {85.6, 79.5, 83.1, 80.0, 78.2, 75.0};

        int class_1, class_2;

        double sum;

        Scanner sc = new Scanner(System.in);

        class_1 = sc.nextInt();
        class_2 = sc.nextInt();

        sum = score_arr[class_1-1] + score_arr[class_2-1];
        System.out.print(sum);

        sc.close();
    }
}

package OAS;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class goe_0811 {
    public static void main(String[] args) {

        int[] array = new int[10];
        int temp;

        int num;

        Scanner sc = new Scanner(System.in);

        for(int i = 0; i < array.length; i++){
            num = sc.nextInt();
            array[i] = num;
        }

        sc.close();

        for(int i = 0; i < array.length; i++){
            for(int j = i+1; j < array.length; j++) {
                if (array[i] < array[j]) {
                    temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
        }

        for(int i = 0; i < array.length; i++){
            System.out.print(array[i] + " ");
        }
    }
}

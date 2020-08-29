package OAS;

import java.util.Scanner;

public class goe_0813 {
    public static void main(String[] args) {

        int[] array = new int[100];

        int num, max = -999, min = 999;

        Scanner sc = new Scanner(System.in);

        for(int i = 0; i < array.length; i++){
            num = sc.nextInt();

            if (num == 999){
                break;
            }

            array[i] = num;

            if(max < array[i]){
                max = array[i];
            }else if(min > array[i]){
                min = array[i];
            }

        }

        sc.close();

        System.out.println("max: " + max);
        System.out.println("min: " + min);

    }
}

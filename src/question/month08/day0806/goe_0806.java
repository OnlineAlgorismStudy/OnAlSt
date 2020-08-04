package OAS;

import java.util.Scanner;

public class goe_0806 {
    public static void main(String[] args) {

        int[] array = new int[10];

        int num, min = 0;

        Scanner sc = new Scanner(System.in);

        for(int i = 0; i < array.length; i++){
            num = sc.nextInt();
            array[i] = num;
            if( array[i] <= array[0])
            min = array[i];
        }
        System.out.print(min);

        sc.close();
    }
}

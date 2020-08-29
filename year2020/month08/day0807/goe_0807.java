package OAS;

import java.util.Scanner;

public class goe_0807 {
    public static void main(String[] args) {

        int[] array = new int[10];

        int num, under100_max = 1, above100_min = 10000, max = 1, min = 10000;

        Scanner sc = new Scanner(System.in);

        for(int i = 0; i < array.length; i++){
            num = sc.nextInt();
            array[i] = num;

            if(array[i]  >= under100_max && array[i] < 100){
                under100_max = array[i];
            } else if (array[i] < above100_min && array[i] >= 100){
                above100_min = array[i];
            } else if (array[i] < max){
                under100_max = 100;
            } else if (array[i] >= min){
                above100_min = 100;
            }
        }

        sc.close();

        System.out.print(under100_max + " " + above100_min);

    }
}

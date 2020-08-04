package OAS;

import java.util.Scanner;

public class goe_0804 {
    public static void main(String[] args) {

        int[] array = new int[100];

        int num;

        Scanner sc = new Scanner(System.in);

        for(int i = 0; i < array.length; i++){
            num = sc.nextInt();
            if(num == 0){
                break;
            }
            array[i] = num;
        }

        for(int j = array.length-1; j >= 0; j--){
            if(array[j] != 0)
            System.out.print(array[j] + " ");
        }

        sc.close();
    }
}
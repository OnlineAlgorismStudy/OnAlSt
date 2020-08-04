package OAS;

import java.util.Scanner;

public class goe_0715 {
    public static void main(String[] args) {

        int n;

        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();

        for(int i = n; i > 0; i--){
            for(int j = i; j > 0; j--){
                System.out.print("*");
            }
            if(i == 1){
                for(int k = 0; k <= n; k++){
                    for(int j = 0; j < k; j++){
                        System.out.print("*");
                    }
                    System.out.println();
                }
            }
            System.out.println();
        }
    }
}

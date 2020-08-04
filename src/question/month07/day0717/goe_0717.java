package OAS;

import java.util.Scanner;

public class goe_0717 {
    public static void main(String[] args) {

        int n;

        Scanner sc = new Scanner(System.in);

        n = sc.nextInt();

        for(int i = 0; i < n; i++){
            for(int j = 0; j < i; j++){
                System.out.print(" ");
            }
            for(int k = 0; k < (((n-i)*2)-1); k++){
                System.out.print("*");
            }
            System.out.println();
        }
        // 2-3, 3- 5, 4- 7, 5- 9, 6- 11
        sc.close();
    }
}

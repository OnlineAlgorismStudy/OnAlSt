package OAS;

import java.util.Scanner;

public class goe_0721 {
    public static void main(String[] args) {

        int n;
        int num= 0;
        char ascii = 65;

        Scanner sc = new Scanner(System.in);

        n = sc.nextInt();

        sc.close();

        for(int i = 0; i < n; i++){
            for(int j = i; j < n; j++){
                System.out.printf("%-2d", (num+1));
                num++;
            }
            for(char j = 0; j <= i; j++){
                System.out.printf("%-2c", ascii);
                ascii++;
            }
            System.out.println();
        }
    }
}

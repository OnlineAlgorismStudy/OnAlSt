import java.util.Scanner;

import static java.lang.StrictMath.abs;

public class goe_0723 {
    public static void main(String[] args) {

        int n;

        Scanner sc = new Scanner(System.in);

        n = sc.nextInt();

        for(int i = 0; i < n; i++){
            for(int j = 0; j < i; j++){
                System.out.print(" ");
            }
            for(int j = 0; j < (((n-i)*2)-1); j++){
                System.out.print("*");
            }
            System.out.println();
        }
        //1-1, 2-3, 3-5
        //1- 0, 3- 1, 5- 2
        for(int i = 1; i < n; i++){
            for(int j = i; j < n-1; j++){
                System.out.print(" ");
            }
            for(int j = (((i+1)*2)-1); j > 0; j--){
                System.out.print("*");
            }
            System.out.println();
        }
        sc.close();
    }
}

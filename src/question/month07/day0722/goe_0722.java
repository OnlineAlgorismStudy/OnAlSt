import java.util.Scanner;

public class goe_0722 {
    public static void main(String[] args) {

        int n;

        Scanner sc = new Scanner(System.in);

        n = sc.nextInt();

        for(int i = 0; i < n; i++){
            for(int j = 0; j <= i; j++){
                System.out.print("*");
            }
            System.out.println();
        }

        for(int i = 0; i < n; i++){
            for(int j = i; j < n-1; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}

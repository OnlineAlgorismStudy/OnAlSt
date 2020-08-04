import java.util.Scanner;

public class goe_0727 {
    public static void main(String[] args) {

        int n;

        Scanner sc = new Scanner(System.in);

        n = sc.nextInt();

        sc.close();

        for(int i = 0; i < n; i++){
            for(int j = i; j < n-1; j++){
                System.out.print("  ");
            }
            for(int j = 0; j <= i; j++){
                System.out.printf(j+1+ " ");
            }
            System.out.println();
        }
    }
}

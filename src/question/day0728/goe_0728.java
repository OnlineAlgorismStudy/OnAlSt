import java.util.Scanner;

public class goe_0728 {
    public static void main(String[] args) {

        int n, k = 0;

        Scanner sc = new Scanner(System.in);

        n = sc.nextInt();

        sc.close();

        for(int i = 0; i < n; i++){
            for(int j = 0; j < i; j++){
                System.out.printf("%2s", "");
            }
            for(int j = i; j < n; j++) {
                System.out.print((k + 1) + " ");
                k++;
            }
            System.out.println();
        }
    }
}

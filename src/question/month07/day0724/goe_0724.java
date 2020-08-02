import java.util.Scanner;

public class goe_0724 {
    public static void main(String[] args) {

        int n;

        Scanner sc = new Scanner(System.in);

        n = sc.nextInt();

        // 1-0, 2-2, 3-4 4-6
        for(int i = 0; i < n; i++){
            for(int j = 0; j < ((n-i)*2 -2); j++){
                System.out.print(" ");
            }
            for(int j = 0; j < ((i+1)*2 -1); j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}

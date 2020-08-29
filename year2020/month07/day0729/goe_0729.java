import java.util.Scanner;

public class goe_0729 {
    public static void main(String[] args) {
        int n, num;

        Scanner sc = new Scanner(System.in);

        n = sc.nextInt();

        sc.close();

        num = n*2-1; //5, 0 1 2 3 4

        for(int i = 0; i < num; i++){
            if( i < num/2 ){
                for(int j = 0; j <= i; j++){
                    System.out.printf("%-2s","#");
                }
                System.out.println();
            } else {
                for(int k = num/2; k < i; k++){
                    System.out.printf("%-2s", "");
                }
                for(int j = i; j < num; j++){
                    System.out.printf("%-2s","#");
                }
                System.out.println();
            }
        }
    }
}

import java.util.Scanner;

public class goe_0730 {
    public static void main(String[] args) {

        int n, num = 1;

        Scanner sc = new Scanner(System.in);

        n = sc.nextInt();

        sc.close();

        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                System.out.print(num + " ");
                num+=2;
                if(num > 10){
                    num = 1;
                }
            }
            System.out.println();
        }
    }
}

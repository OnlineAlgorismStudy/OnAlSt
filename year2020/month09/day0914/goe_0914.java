import java.util.Scanner;

public class goe_0914 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();

        while (num > 100){
            System.out.println("100이하의 자연수를 입력하시오. ");
            num = sc.nextInt();
        }

        square(num);

        sc.close();
    }

    public static void square(int n){

            for(int i = 0; i < n; i++){
                for(int j = 0; j < n; j++){
                    System.out.print(((i+1)*(j+1)) + " ");
                }
                System.out.println();
            }
    }
}

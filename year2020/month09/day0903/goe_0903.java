import java.util.Scanner;

public class goe_0903 {
    /*
    * 100 미만의 정수만 입력된다.
    * 정수 n을 입력 받아 n x n 크리의 숫자 사각형을 출력하는 프로그램을 작성하시오.
    * 이때  정수 n을 전달받아 숫자 정사각형을 출력하는 함수를 작성하고, 입력받은 정수 n을 함수로 전달하여 출력한다.
    * */
    public static void main(String[] args) {

        int num = 0;

        Scanner sc = new Scanner(System.in);

        num = sc.nextInt();

        fuction(num);

        sc.close();

    }

    public static void fuction(int n){

        int num = 0;

        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                System.out.print(num+1 + " ");
                num++;
            }
            System.out.println();
        }

    }
}

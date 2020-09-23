import java.util.Scanner;

public class goe_0923 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double num1, num2;

        root(num1 = sc.nextDouble(), num2 = sc.nextDouble());

        sc.close();
    }

    public static void root(double num1, double num2) {

        int cnt = 0;

        num1 = Math.sqrt(num1);
        num2 = Math.sqrt(num2);

        if (num1 < num2)
            /*
            두 실수 사이에 있는 정수는 4와 5가 된다. 첫번째 실수를 정수로 형변환 했을 때, 사이에 있는 정수의
            값과 값이 같지 않은 이상 포함하지 않는다.
             */
            for (int i = (int)num1+1; i <= num2; i++) {
                //이때 i 를 출력하면 4와 5가 출력된다.
                //System.out.print(i + " ");
                cnt++;
            }
        else {
            for (int i = (int)num2+1; i <= num1; i++) {
                cnt++;
            }
        }
        System.out.println(cnt);
    }
}

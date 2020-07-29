import java.util.Scanner;

public class goe_0731 {
    public static void main(String[] args) {

        int firstNum, secondNum;

        Scanner sc = new Scanner(System.in);

            while (true) {
                firstNum = sc.nextInt();
                secondNum = sc.nextInt();
                if ((firstNum < 2 || firstNum > 9) || (secondNum < 2 || secondNum > 9)) {
                    System.out.println("INPUT ERROR! \n다시 입력해주세요");
                } else {
                    for (int i = 0; i < 9; i++) {
                        print(firstNum, i);
                        print(secondNum, i);
                        System.out.println();
                    }
                    break;
                }
            }
        sc.close();
        }

    public static void print(int n, int i){
        System.out.print(n + " * " + (i + 1) + " =");
        System.out.printf("%3d", n*(i + 1));
        System.out.printf("%3s", "");
    }
}

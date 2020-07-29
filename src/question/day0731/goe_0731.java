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
                    if(firstNum < secondNum){
                        print(firstNum, secondNum);
                        break;
                    }else {
                        print2(firstNum, secondNum);
                        break;
                    }
                }
            }
        sc.close();
        }

    public static void print(int first, int second){
        for(int i = 0; i < 9; i++){
            for(int j = first; j <= second; j++){
                System.out.print( j + "*" + (i+1) + " = ");
                System.out.printf("%3d", j*(i+1));
                System.out.printf("%3s", "");
            }
            System.out.println();
        }
    }

    public static void print2(int first, int second){
        for(int i = 0; i < 9; i++){
            for(int j = first; j >= second; j--){
                System.out.print( j + "*" + (i+1) + " = ");
                System.out.printf("%3d", j*(i+1));
                System.out.printf("%3s", "");
            }
            System.out.println();
        }
    }
}

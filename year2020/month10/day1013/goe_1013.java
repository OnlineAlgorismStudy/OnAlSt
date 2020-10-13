import java.util.Scanner;

public class goe_1013 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();

        System.out.print(Sequence(num));

        sc.close();
    }

    public static int Sequence(int num){

        int result;

        if(num == 1){
            return 1;
        } else if(num == 2){
            return 2;
        } else {
            result = (Sequence(num-2)*Sequence(num-1)) % 100;
            return  result;
        }
    }
}

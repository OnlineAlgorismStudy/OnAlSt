import java.util.Scanner;

public class goe_0908 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int smaller = sc.nextInt();
        int bigger = sc.nextInt();

        calculate(smaller, bigger);

        sc.close();
    }

    public static void calculate(int smaller, int bigger) {

        int tmp;

        if(bigger < smaller){
            tmp = smaller;
            smaller = bigger;
            bigger = tmp;

            System.out.println(bigger/2 + " " + smaller*2);
        }else {
            System.out.println(smaller * 2 + " " + bigger / 2);
        }
    }
}

import java.util.Scanner;

public class goe_0708 {
    public static void main(String[] args) {

        int key;

        Scanner sc = new Scanner(System.in);

        while (true){
            print();
            key = sc.nextInt();
            System.out.println();

            if(key == 1){
                System.out.println("Seoul \n");
            } else if (key == 2){
                System.out.println("Washington \n");
            } else if (key == 3){
                System.out.println("Tokyo \n");
            } else if (key == 4) {
                System.out.println("Beijing \n");
            } else {
                System.out.println("none \n");
                break;
            }
        }
        sc.close();
    }

    public static void print(){
        System.out.println("1. Korea");
        System.out.println("2. USA");
        System.out.println("3. Japan");
        System.out.println("4. China");
        System.out.print("number? ");
    }
}

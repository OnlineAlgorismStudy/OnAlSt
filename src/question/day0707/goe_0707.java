import java.util.Scanner;

public class goe_0707 {
    public static void main(String[] args) {

        int key;

        Scanner sc = new Scanner(System.in);
        System.out.print("Number? ");
        key = sc.nextInt();

        switch (key){
            case 1:
                System.out.println("dog");
                break;
            case 2:
                System.out.println("cat");
                break;
            case 3:
                System.out.println("chick");
                break;
            case 4:
                System.out.println("kumkang zzang");
                break;
            default:
                System.out.println("I don't know");
        }
    }
}

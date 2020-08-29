import java.util.Scanner;

public class goe_0803 {
    public static void main(String[] args) {

        String[] array = new String[10];

        String alphabet;

        int index = 1;

        Scanner sc = new Scanner(System.in);
        sc.close();

        for(int i = 0; i < array.length; i++) {
            alphabet = sc.next();
            array[i] = alphabet;
        }

        System.out.print(array[1-index] + " " + array[4-index] + " " + array[7-index]);
    }
}

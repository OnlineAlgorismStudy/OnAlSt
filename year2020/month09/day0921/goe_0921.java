import java.util.Scanner;

public class goe_0921 {
    public static void main(String[] args) {

        int[] array = new int[10];
        Scanner sc = new Scanner(System.in);

        for(int i = 0; i < array.length; i++) {
            int num = sc.nextInt();
            array[i] = num;
        }

        printBubble(array);

        sc.close();
    }

    public static void printBubble(int[] array) {

        int temp;

        for (int i = 0; i < array.length-1; i++) {
            for (int j = 0; j < array.length-1; j++) {
                if (array[j] < array[j+1]) {
                    temp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = temp;
                }
            }
            for(int a = 0; a < array.length; a++){
                System.out.print(array[a] + " ");
            }
            System.out.println();
        }
    }
}
import java.util.Scanner;

public class goe_0917 {
    public static void main(String[] args) {

        int cnt;

        Scanner sc = new Scanner(System.in);

        cnt = sc.nextInt();

        int[] array = new int[cnt];

        descOrder(array);

    }

    public static void descOrder(int[] array){

        Scanner sc = new Scanner(System.in);
        int num;

        int temp = 0;

        for(int i = 0; i < array.length; i++){
            num = sc.nextInt();
            array[i] = num;
        }

        for(int i = 0; i < array.length; i++) {
            for(int j = (i+1); j < array.length; j++){
            if (array[i] < array[j]) {
                temp = array[j];
                array[j] = array[i];
                array[i] = temp;
                }
            }
        }

        for(int i = 0; i < array.length; i++){
            System.out.print(array[i] + " ");
        }

        sc.close();
    }
}

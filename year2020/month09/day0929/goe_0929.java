import java.util.Scanner;

public class goe_0929 {

    final static int cnt = 7;

    public static void main(String[] args) {

        int[] array = new int[cnt];

        Scanner sc = new Scanner(System.in);

        for(int i = 0; i < array.length; i++){
            int num = sc.nextInt();
            array[i] = num;
        }

        array(array);

        sc.close();
    }

    public static void array(int[] array){

        int temp = 0;

        for(int i = 0; i < array.length-4; i++)
            for(int j = 0; j < array.length-1; j++){
                if(array[j] > array[j+1]){
                    temp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = temp;
                }
            }
        for(int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }
}

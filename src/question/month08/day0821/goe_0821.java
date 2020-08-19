import java.util.Scanner;

public class goe_0821 {
    public static void main(String[] args) {

        int[][] array1 = new int[2][4];
        int[][] array2 = new int[2][4];

        Scanner sc = new Scanner(System.in);

        int num1 = 0,num2 = 0;

        String a1 = "first array", a2 = "second array";

        array(array1, num1, sc, a1);

        array(array2, num2, sc, a2);

        printMtp(array1, array2);

        sc.close();
    }

    public static void array(int[][] arr, int num, Scanner sc, String s){

        System.out.println(s);

        for(int i = 0; i < arr.length; i++){
            for(int j = 0; j < arr[i].length; j++){
                num = sc.nextInt();
                arr[i][j] = num;
            }
        }
    }

    public static void printMtp(int[][] arr, int[][] arr2){

        for(int i = 0; i < arr.length; i++){
            for(int j = 0; j < arr[i].length; j++){
                System.out.print(arr[i][j] * arr2[i][j] + " ");
            }
            System.out.println();
        }
    }
}

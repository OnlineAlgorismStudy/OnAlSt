import java.util.Scanner;

public class goe_1116 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[] intArray = new int[5];
        String str = "";

        for(int i = 0; i < intArray.length; i++){
            intArray[i] = sc.nextInt();
            str += intArray[i];
        }

        String[] strArray = str.split("");

        for(int i = 0; i < strArray.length; i++){
            System.out.print(strArray[i]);
            if((i+1)%3 == 0){
                System.out.println();
            }
        }

       sc.close();
    }
}

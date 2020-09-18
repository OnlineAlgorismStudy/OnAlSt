import java.util.Scanner;

public class goe_0918 {
    public static void main(String[] args) {

        int num1, num2;
        float numf1, numf2;

        Scanner sc = new Scanner(System.in);

        print(num1 = sc.nextInt(), num2 = sc.nextInt(),numf1 = sc.nextFloat(), numf2 = sc.nextFloat());

        sc.close();
    }

    public static void print(int num1,int num2, float numf1,float numf2){

        if((Math.abs(num1) > Math.abs(num2))){
            System.out.println(num1);
        }else {
            System.out.println(num2);
        }

        if(Math.abs(numf1) > Math.abs(numf2)){
            System.out.println(numf2);
        }else {
            System.out.println(numf1);
        }
    }
}

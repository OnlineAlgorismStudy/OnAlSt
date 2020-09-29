import java.util.Scanner;

public class goe_0928 {
    public static void main(String[] args) {

        double[] array = new double[3];

        Scanner sc = new Scanner(System.in);

        for(int i = 0; i < array.length; i++){
            double num = sc.nextDouble();
            array[i] = num;
        }

        avg(array);

     sc.close();
    }

    public static void avg(double[] array){

        double sum = 0;

       for(int i = 0; i < array.length; i++){
           sum += array[i];
       }

        System.out.println(Math.round((sum/array.length)));

       sum = 0;

        for(int i = 0; i < array.length; i++){
            sum += Math.round(array[i]);
        }

        System.out.println(Math.round((sum/array.length)));
    }
}

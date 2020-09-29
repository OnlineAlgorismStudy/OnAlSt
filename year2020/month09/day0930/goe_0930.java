import java.util.Scanner;

public class goe_0930 {
    final static double pie = 3.141592;

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("radius : ");
        double radius = sc.nextDouble();

        area(radius);

        sc.close();
    }

    public static void area(double radius){

        double area;

        area = pie * radius * radius;

        System.out.print("area = " + Math.round(area*1000)/1000.0);
    }
}

import java.util.Scanner;
 
public class Main {
    static int i = 0;
 
    public static int result(int num) {
        if (num == 1) {
            return i;
        } // end if
 
        if (num % 2 == 1) {
            i++;
            return result(num / 3);
        } else {
            i++;
            return result(num / 2);
        }
 
    } // result
 
    public static void main(String[] args) throws Exception {
        // TODO Auto-generated method stub
 
        Scanner sc = new Scanner(System.in);
 
        int num = sc.nextInt();
 
        sc.close();
 
        System.out.println(result(num));
 
    } // main
 
} // class

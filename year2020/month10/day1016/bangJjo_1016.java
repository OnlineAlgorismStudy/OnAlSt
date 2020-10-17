import java.util.Scanner;
 
public class Main {
 
    static Scanner sc = new Scanner(System.in);
    static int num = 0;
    static int[] arr = new int[101];
     
    public static void main(String[] args) {
        // TODO Auto-generated method stub
 
        num = sc.nextInt();
         
        arr[0] = 1;
         
        dice(1);
 
    } // main
 
    public static void dice(int cnt) {
 
        if(cnt > num) {
            for(int i = 1; i <= num; i++) {
                System.out.print(arr[i]+" ");
            } // end for
            System.out.println();
            return;
        } // end if
         
        for(int i = arr[cnt-1]; i <= 6; i++) {
            arr[cnt] = i;
            dice(cnt+1);
        } // end for
         
    } // result
 
} // class

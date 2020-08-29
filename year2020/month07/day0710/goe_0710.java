import java.util.Scanner;

public class goe_0710 {
    public static void main(String[] args) {
        
        int cnt;
        int score;
        int sum = 0;
        double avg;

        Scanner sc = new Scanner(System.in);
        cnt = sc.nextInt();

        for(int i = 0; i < cnt; i++ ){
            if(cnt > 10){
                System.out.println("과목수는 10 이하여야합니다. ");
                System.exit(0);
            }
            score = sc.nextInt();
            sum += score;
        }

        avg = (double)sum/cnt;

        System.out.print("avg: " + Math.round(avg*10)/10.0);
        System.out.println();

        if(avg >= 80){
            System.out.println("pass");
        }else {
            System.out.println("fail");
        }
        sc.close();
    }
}

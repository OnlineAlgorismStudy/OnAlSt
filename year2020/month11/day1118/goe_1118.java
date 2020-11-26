package month11;

import java.util.Scanner;

public class goe_1118 {
    public static void main(String[] args) {

        String[] array = {"flower", "rose", "lily", "daffodil", "azalea"};
        int cnt = 0;

        Scanner sc = new Scanner(System.in);

        String str = sc.next();

        for(int i = 0; i < array.length; i++){

            if(array[i].substring(1,3).contains(str)){
                System.out.println(array[i]);
                cnt++;
            }else {

            }
        }

        System.out.println(cnt);

        sc.close();
    }
}

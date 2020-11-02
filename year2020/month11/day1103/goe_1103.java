import com.sun.deploy.util.ArrayUtil;

import java.util.Scanner;

public class goe_1103 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        StringBuffer str = new StringBuffer(sc.nextLine());

        int num;

        //StringBuffer 클래스 개체의 원하는 위치 문자를 제거할 때 delete,
        // deleteCharAt 멤버 메서드를 사용합니다.
        //str의 길이가 1이 될때동안 반복
        while (!(str.length() == 1)){
            num = sc.nextInt() - 1;

            //입력한 숫자에서 1을 뺀 숫자가 str의 길이와 같거나 크다면 마지막 숫자를 삭제
            if(num >= str.length()){
                str.deleteCharAt(str.length()-1);
            }
            else {
                str.deleteCharAt(num);
            }
            System.out.println(str);
        }

        sc.close();
    }
}

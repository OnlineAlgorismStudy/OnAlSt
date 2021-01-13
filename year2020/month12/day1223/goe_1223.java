package month12;

public class goe_1223 {
    public static boolean solution(int x) {
        boolean answer = true;
        int a = x;
        int sum = 0;

        while (a >= 1) {
            sum += a % 10;
            a = a / 10;
        }

        if (x % sum != 0) {
            answer =  false;
        }

        return answer;
    }

    public static void main(String[] args) {
        System.out.println(solution(9000));
    }
}

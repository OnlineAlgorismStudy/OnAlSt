package month12;

public class goe_1218 {
    public static String solution(int num) {
        String answer = "";

        return (num % 2 == 0) ? "Even" : "Odd";
    }

    public static void main(String[] args) {
        System.out.println(solution(4));
    }
}

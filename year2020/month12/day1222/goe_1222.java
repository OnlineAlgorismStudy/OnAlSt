package month12;

public class goe_1222 {
    public static double solution(int[] arr) {
        double answer = 0;
        int sum = 0;

        for(int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }

        answer = (double)sum/arr.length;

        return answer;
    }

    public static void main(String[] args) {
        System.out.println(solution(new int[]{5,5}));
    }
}

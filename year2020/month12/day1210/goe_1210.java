package month12;

public class goe_1210 {
    public static int solution(int[] a, int[] b) {
        int answer = 0;

        for(int i = 0; i < a.length; i++) {
            answer += a[i]*b[i];
        }
        return answer;
    }

    public static void main(String[] args) {
        System.out.println(solution(new int[]{-1,0,1},new int[]{1,0,-1}));
    }
}

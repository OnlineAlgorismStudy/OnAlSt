#정렬굳이안해도 나머지값을 차곡차곡 넣어주면 자연스레 역순정렬!!
class Solution {
    public int[] solution(long n) {
        int[] answer = new int[String.valueOf(n).length()];
		int i = 0;
		while(n != 0) {
			answer[i] = (int) (n % 10);
			n = n / 10;
			i++;
		}
        return answer;
    }
}

class Solution {
  public long solution(int a, int b) {
      long answer = 0;
      int start = a < b ? a : b;
      int end = start == a ? b : a;
      for (int i = start; i <= end; i++) {
          answer += i;
      }
      return answer;
  }
}
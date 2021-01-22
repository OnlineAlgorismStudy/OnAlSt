class Solution {
    public int[] solution(int n) {
        int num = 0;
		int cnt = (n * (n+1))/2;
		int[][] arr = new int[n+1][n+1];
		int[] res = new int[cnt];
		int i = 0, j = 0, k = n;
		
		int temp = k;
		while(num < cnt) {
			// 세로 방향으로 입력
			while(k > 0 && arr[i+1][j] == 0) {
				arr[++i][j] = ++num;
				k--;
			}
			k = --temp;
			// 가로 방향으로 입력
			while(k > 0 && arr[i][j+1] == 0) {
				arr[i][++j] = ++num;
				k--;
			}
			k = --temp;
			// 대각선 방향으로 입력
			while(k > 0 && arr[i-1][j-1] == 0) {
				arr[--i][--j] = ++num;
				k--;
			}
			k = --temp;
		}
		
		int index = 0;
		for(i=1; i<=n; i++) {
			for(j=0; j<=n; j++) {
				if(arr[i][j] != 0) {
					res[index++] = arr[i][j];
				}
			}
		}
        return res;
    }
}

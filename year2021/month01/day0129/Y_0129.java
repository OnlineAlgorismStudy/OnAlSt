class Solution {
    static long[] f = new long[100001];
    
    public long solution(int n) {
        f[0] = 0;
        f[1] = 1;
        
		for(int i=2; i<=n; i++)
			f[i] = f[i] = (fibo(i)) % 1234567;
        
        if(n == 1) return 1;
        else return f[n];
    }
    
    long fibo(int n) {
        return f[n-2] + f[n-1];
    }
}

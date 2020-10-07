#define _CRT_SECURE_NO_WARNINGS
#include <iostream>
using namespace std;

void dice(int n, int m);
int sum[10];
int cnt = 0;

int main() 
{
	int n, m;
	scanf("%d %d", &n, &m);
	dice(n,m);
}

void dice(int n, int m) 
{
	for(int i=1; i<=6; ++i)
	{
		sum[cnt] = i;
		if(cnt == n-1)
		{
			int temp = 0;
			for(int j=0; j<=cnt; ++j)
				temp += sum[j];
			if(temp == m)
			{
				for(int k=0; k<n; ++k)
					printf("%d ", sum[k]);
				printf("\n");
				return;
			}
		}
		else
		{
			cnt++;
			dice(n,m);
			cnt--;
		}
	}
}

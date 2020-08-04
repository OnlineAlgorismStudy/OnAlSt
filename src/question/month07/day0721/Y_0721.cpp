#define _CRT_SECURE_NO_WARNINGS
#include <iostream>
using namespace std;

int main() {
	int n;
	int cnt = 0, number = 1, alpha = 65;
	scanf("%d", &n);


	for(int i=0; i<n; i++) 
	{
		for(int j=0; j<n+1; j++)
		{
			if(j >= (n - cnt))
				printf("%c ", alpha++);
			else
				printf("%d ", number++);
		}
		cnt++;
		printf("\n");
	}
}

#define _CRT_SECURE_NO_WARNINGS
#include <iostream>
using namespace std;

int main() {
	int n, cnt = 0, flag = 0;
	scanf("%d", &n);


	for(int i=0; i<(n*2-1); i++) 
	{
		if(flag == 0) cnt++;
		else cnt--;

		for(int j=0; j<cnt; j++)
			printf("*");

		if(cnt == n && flag == 0)
			flag = 1;

		printf("\n");
	}
}

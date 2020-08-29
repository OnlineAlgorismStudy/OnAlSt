#define _CRT_SECURE_NO_WARNINGS
#include <iostream>
using namespace std;

int main() {
	int n;
	scanf("%d", &n);

	int odd = 1;
	for(int i=0; i<n; i++)
	{
		for(int j=0; j<n; j++)
		{
			printf("%d ", odd%10); // 10으로 나누어 나머지만 출력
			odd += 2;
		}
		printf("\n");
	}
}

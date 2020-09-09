#define _CRT_SECURE_NO_WARNINGS
#include <iostream>
#include <string>
using namespace std;

void print(int n)
{
	int sum = 0;
	for(int i=1; i<=n; i++)
		sum += i;
	printf("%d\n", sum);
}

int main()
{
	int n;
	scanf("%d", &n);
	print(n);
}

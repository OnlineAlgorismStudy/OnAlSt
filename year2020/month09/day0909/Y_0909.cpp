#define _CRT_SECURE_NO_WARNINGS
#include <iostream>
using namespace std;

void print(int n1, int n2)
{
	for(int i=n1; i<=n2; i++)
	{
		printf("== %ddan ==\n", i);
		for(int j=1; j<=9; j++)
		{
			printf("%d * %d = %d\n", i, j, i*j);
		}
		printf("\n");
	}
}

int main()
{
	int n1, n2;
	scanf("%d %d", &n1, &n2);

	if(n1 > n2) print(n2, n1);
	else print(n1, n2);
}

#define _CRT_SECURE_NO_WARNINGS
#include <iostream>
#include <algorithm>
#include <string>
using namespace std; 

void calc(int *n1, int *n2)
{
	if(*n1 > *n2)
	{
		(*n1) /= 2;
		(*n2) *= 2;
	}
	else
	{
		(*n1) *= 2;
		(*n2) /= 2;
	}
}

int main() {
	int n1, n2;
	scanf("%d %d", &n1, &n2);
	calc(&n1, &n2);
	printf("%d %d\n", n1, n2);
}

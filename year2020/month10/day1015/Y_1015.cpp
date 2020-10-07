#define _CRT_SECURE_NO_WARNINGS
#include <iostream>
using namespace std;
int Calc(int n, int m);

int main() 
{
	int n1, n2, n3;
	scanf("%d %d %d", &n1, &n2, &n3);

	int n = n1 * n2 * n3;
	printf("%d\n", Calc(n, 1));
}

int Calc(int n, int m) 
{
	if(!(n/10))
		return n*m;

	if(n%10)
		return Calc(n/10, (n%10)*m);
	else
		return Calc(n/10, m);
}

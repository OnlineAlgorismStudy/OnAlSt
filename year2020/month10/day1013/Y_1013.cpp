#define _CRT_SECURE_NO_WARNINGS
#include <iostream>
using namespace std;
int getSeq(int n);

int main() 
{
	int n;
	scanf("%d", &n);
	printf("%d\n", getSeq(n));
}

int getSeq(int n) 
{
	if(n <= 2)
		return n;
	return (getSeq(n-1) * getSeq(n-2))%100;
}

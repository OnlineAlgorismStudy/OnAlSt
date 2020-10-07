#define _CRT_SECURE_NO_WARNINGS
#include <iostream>
using namespace std;
void Division(int n, int level);

int main() 
{
	int n;
	scanf("%d", &n);
	Division(n, 0);
}

void Division(int n, int level) 
{
	if(n == 1) {
		printf("%d\n", level);
		return;
	}

	if(n%2 == 0)
	{
		Division(n/2, level+1);
	}
	else
	{
		Division(n/3, level+1);
	}
}

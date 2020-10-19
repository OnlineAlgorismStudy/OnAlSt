#define _CRT_SECURE_NO_WARNINGS
#include <iostream>
using namespace std;

int main()
{
	while(true)
	{
		int n;
		printf("ASCII code =? ");
		scanf("%d", &n);

		if(n < 65 || n > 122)
			break;

		printf("%c\n", n);
	}
}

#define _CRT_SECURE_NO_WARNINGS
#include <iostream>
using namespace std;

int main() {
	int n;
	int alpha = 65;
	scanf("%d", &n);

	if(n<3 || n >10)
		return 0;

	for(int i=0; i<n; i++) 
	{
		for(int j=0; j<(n-i); j++)
		{
			printf("%c", alpha++);
		}
		printf("\n");
	}
}

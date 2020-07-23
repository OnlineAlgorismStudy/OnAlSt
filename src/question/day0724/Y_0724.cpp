#define _CRT_SECURE_NO_WARNINGS
#include <iostream>
using namespace std;

int main() {
	int n;
	scanf("%d", &n);

	int star = 1;
	int space = n*2;

	for (int i = 0; i < n; i++)
	{
		for (int j = 0; j < space; j++) 
			printf(" "); // 공백 출력

		for (int j = 0; j < star; j++)
			printf("*"); // 별 출력

		star += 2;
		space -= 2;
		printf("\n");
	}

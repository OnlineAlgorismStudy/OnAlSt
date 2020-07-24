#define _CRT_SECURE_NO_WARNINGS
#include <iostream>
using namespace std;

int main() {
	int n;
	scanf("%d", &n);

	int cnt = 1;
	int number = 1;
	int space = n;

	for (int i = 0; i < n; i++)
	{
		for (int j = 0; j < space; j++) 
			printf("  "); // 공백 출력

		for (int j = 0; j < number; j++)
			printf("%d ", cnt++); // 별 출력

		number += 1;
		space -= 1;
		cnt = 1;
		printf("\n");
	}
}

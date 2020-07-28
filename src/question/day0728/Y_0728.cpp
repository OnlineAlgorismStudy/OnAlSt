#define _CRT_SECURE_NO_WARNINGS
#include <iostream>
using namespace std;

int main() {
	int n;
	scanf("%d", &n);

	int cnt = 1;
	int number = n;
	int space = 0;

	for (int i = 0; i < n; i++)
	{
		for (int j = 0; j < space; j++) 
			printf("  "); // 공백 출력

		for (int j = 0; j < number; j++)
			printf("%d ", cnt++); // 숫자 출력

		printf("\n");
		number -= 1;
		space += 1;
	}
}

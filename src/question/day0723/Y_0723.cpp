#define _CRT_SECURE_NO_WARNINGS
#include <iostream>
using namespace std;

int main() {
	int n;
	scanf("%d", &n);

	int star = n*2-1;
	int space = 0;
	bool inverse = false;

	for (int i = 0; i < n * 2 - 1; i++)
	{
		for (int j = 0; j < space; j++) 
			printf(" "); // 공백 출력

		for (int j = 0; j < star; j++) 
			printf("*"); // 별 출력

		printf("\n");

		// 별 꼭대기까지 출력하면 inverse true로 변경
		if (inverse == false && star == 1)
			inverse = true;

		// inverse 여부에 따른 공백&별 카운트 증감
		if (inverse == false)
		{
			space += 1;
			star -= 2;
		}
		else
		{
			space -= 1;
			star += 2;
		}
	}
}

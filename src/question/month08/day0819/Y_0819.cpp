#define _CRT_SECURE_NO_WARNINGS
#include <iostream>
#include <vector>
#include <algorithm>
using namespace std;

int alpha[50]; // 모든 카운트는 초기 0

int main() {
	char c = 0;

	while(true)
	{
		scanf_s(" %c", &c, 1);

		if(c >= 65 && c <= 90)
			alpha[c-65] += 1; // 카운트 증가
		else
			break;
	}

	for(int i=0; i<50; i++)
	{
		if(alpha[i] > 0)
			printf("%c : %d\n", i+65, alpha[i]);
	}
}

#define _CRT_SECURE_NO_WARNINGS
#include <iostream>
using namespace std;

int main() {
	int n;
	scanf("%d", &n);

	int hash = 1;
	int space = 0;
	bool reverse = false;

	for (int i = 0; i < (n*2-1); i++)
	{
		for (int j = 0; j < space; j++) 
			printf("  "); // 공백 출력

		for (int j = 0; j < hash; j++)
			printf("# "); // 해시 출력

		printf("\n");

		if(hash == n)
			reverse = true;

		if(reverse == true) 
		{
			hash -= 1;
			space += 1;
		} else 
		{
			hash += 1;
		}
	}
}

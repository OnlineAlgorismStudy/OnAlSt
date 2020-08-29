#define _CRT_SECURE_NO_WARNINGS
#include <iostream>
#include <vector>
#include <algorithm>
using namespace std;

int main() {
	int num;
	int odd = 0, even = 0;
	for(int i=1; i<=10; i++)
	{
 		scanf("%d", &num);
		if(i%2 == 0)
			even += num;
		else
			odd += num;
	}

	printf("odd : %d\n", odd);
	printf("even : %d\n", even);
}

#define _CRT_SECURE_NO_WARNINGS
#include <iostream>
#include <vector>
#include <algorithm>
using namespace std;

int main() {
	int num;
	int max_num = 0, min_num = 9876543;

	while(true)
	{
		scanf("%d", &num);
		if(num == 999) break;

		max_num = num > max_num ? num : max_num;
		min_num = num < min_num ? num : min_num;
	}

	printf("max : %d\n", max_num);
	printf("min : %d\n", min_num);
}

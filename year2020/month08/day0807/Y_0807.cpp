#define _CRT_SECURE_NO_WARNINGS
#include <iostream>
using namespace std;

int main() {
	int num;
	int max_num = 0, min_num = 9876543;

	for (int i = 0; i < 10; i++)
	{
		scanf("%d", &num);
		if (num < 100)
			max_num = num > max_num ? num : max_num;
		if (num > 100)
			min_num = num < min_num ? num : min_num;
	}
	printf("%d %d\n", max_num, min_num);
}

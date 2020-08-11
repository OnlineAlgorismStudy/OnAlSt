#define _CRT_SECURE_NO_WARNINGS
#include <iostream>
#include <vector>
#include <algorithm>
using namespace std;

int main() {
	int num;
	int cnt = 0, sum = 0;

	while(true)
	{
		scanf("%d", &num);

		if(num == 0)
			break;

		if(num%5 == 0)
		{
			cnt++;
			sum += num;
		}
	}

	printf("Multiples of 5 : %d\n", cnt);
	printf("sum : %d\n", sum);
	printf("avg : %.1f\n", (double)sum/cnt);
}

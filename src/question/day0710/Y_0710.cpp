#define _CRT_SECURE_NO_WARNINGS
#include <iostream>
using namespace std;

int main() {
	int n;
	scanf("%d", &n);
	
	if(n > 10)
		return 0;

	double sum = 0;
	for(int i=0; i<n; i++)
	{
		int point;
		scanf("%d", &point);

		sum += point;
	}

	double avg = sum/n;
	printf("avg : %.1f\n", avg);

	if(avg >= 80)
		printf("pass\n");
	else
		printf("fail\n");
}

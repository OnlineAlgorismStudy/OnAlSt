#define _CRT_SECURE_NO_WARNINGS
#include <iostream>
using namespace std;

int main() {
	int num[10];
    int even = 0;
    float odd = 0;
    for(int i=0; i<10; i++)
    {
        scanf("%d", &num[i]);
        if(i%2 == 1) even += num[i];
        else odd += num[i];
    }

    printf("sum : %d\n", even);
    printf("avg : %.1f\n", odd/5);
	return 0;
}

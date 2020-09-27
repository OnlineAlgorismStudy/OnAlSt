#define _CRT_SECURE_NO_WARNINGS
#include <iostream>
#include <cmath>
#define PI 3.141592
using namespace std;
int print(int n);

int main()
{
    int n;
    scanf("%d", &n);
    printf("%d\n", print(n));
}

int print(int n)
{
    if(n == 0) return 0;
    return (((n%10)*(n%10)) + print(n/10));
}

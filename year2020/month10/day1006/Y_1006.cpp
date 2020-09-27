#define _CRT_SECURE_NO_WARNINGS
#include <iostream>
#include <cmath>
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
    if(n<=1) return 1;
    return print(n/2) + print(n-1);
}

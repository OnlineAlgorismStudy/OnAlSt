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
    print(n);
}

int print(int n)
{
    if(n<=0)
        return 0;
    print(n/2);
    printf("%d ", n);
    
    return 0;
}

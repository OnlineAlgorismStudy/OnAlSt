#define _CRT_SECURE_NO_WARNINGS
#include <iostream>
#include <cmath>
using namespace std;
void print(int n, int sum);

int main()
{
    int n;
    scanf("%d", &n);
    print(n, 0);
}

void print(int n, int sum)
{
    if(n == 0)
    {
        printf("%d\n", sum);
        return;
    }
    
    print(n-1, sum+n);
}

#define _CRT_SECURE_NO_WARNINGS
#include <iostream>
#include <cmath>
using namespace std;
void print(int n);

int main()
{
    int n;
    scanf("%d", &n);
    print(n);
}

void print(int n)
{
    if(n == 1 || n == 2)
    {
        printf("%d ", n);
        return;
    }
    print(n-2);
    printf("%d ", n);
}

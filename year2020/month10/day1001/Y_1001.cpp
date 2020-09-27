#define _CRT_SECURE_NO_WARNINGS
#include <iostream>
#include <cmath>
#define PI 3.141592
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
    if(n == 0)
        return;
    
    printf("recursive\n");
    print(n-1);
}

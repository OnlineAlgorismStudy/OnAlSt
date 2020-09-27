#define _CRT_SECURE_NO_WARNINGS
#include <iostream>
#include <cmath>
using namespace std;

int main()
{
    double d1, d2, d3;
    double sum1 = 0, sum2 = 0;
    scanf("%lf %lf %lf", &d1, &d2, &d3);
    
    sum1 = d1 + d2 + d3;
    sum2 = round(d1) + round(d2) + round(d3);
    printf("%d\n%d\n", (int)round(sum1/3), (int)round(sum2/3));
}

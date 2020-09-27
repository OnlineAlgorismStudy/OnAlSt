#define _CRT_SECURE_NO_WARNINGS
#include <iostream>
#include <cmath>
#define PI 3.141592
using namespace std;

int main()
{
    double radius;
    printf("radius : ");
    scanf("%lf", &radius);
    
    printf("area = %.3lf\n", (round(radius * radius * PI * 1000)/1000));
}

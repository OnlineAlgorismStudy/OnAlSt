#include <iostream>
#include <math.h>
using namespace std;
#define CALC1(X,Y) pow((X-Y),2) 
#define CALC2(X,Y) pow((X+Y),3) 

int main() 
{
	double num1, num2;
	scanf("%lf %lf", &num1, &num2);

	printf("(%.lf - %.lf) ^ 2 = %.lf\n", num1, num2, CALC1(num1, num2));
	printf("(%.lf + %.lf) ^ 2 = %.lf\n", num1, num2, CALC2(num1, num2));
	return 0;
}

#include <iostream>
#include <math.h> 
using namespace std;

int main() 
{
	double num1, num2;
	scanf("%lf %lf", &num1, &num2);
	
	int cnt = 0;
	int big = num1 > num2 ? sqrt(num1) : sqrt(num2);
	int small = num1 > num2 ? sqrt(num2) : sqrt(num1);

	for(int i=small; i<big; i++)
		cnt++;

	printf("%d\n", cnt);
	return 0;
}

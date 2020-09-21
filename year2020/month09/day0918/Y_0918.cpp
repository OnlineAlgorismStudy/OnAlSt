#include <iostream>
#include <math.h>
using namespace std;

void print(int i1, int i2, double d1, double d2)
{
	if(abs(i1) > abs(i2))
		printf("%d\n", i1);
	else
		printf("%d\n", i2);

	if(abs(d1) > abs(d2))
		printf("%.2lf\n", d2);
	else
		printf("%.2lf\n", d1);

}

int main() {
	int i1, i2;
	double d1, d2;

	scanf("%d %d", &i1, &i2);
	scanf("%lf %lf", &d1, &d2);

	print(i1, i2, d1, d2);
	return 0;
}

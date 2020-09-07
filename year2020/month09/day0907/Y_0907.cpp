#include <iostream>
#include <algorithm>
#include <string>
using namespace std; 

void print(double n1, double n2)
{
	printf("%.f\n", pow(n1, n2));
}

int main() {
	double n1, n2;
	scanf("%lf %lf", &n1, &n2);

	print(n1, n2);
}

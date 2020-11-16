#define _CRT_SECURE_NO_WARNINGS
#include <iostream>
#include <string>
#include <sstream>
using namespace std;

int main()
{
	char c[21];
	scanf(" %s", &c);

	int n = atoi(c);
	double d = atof(c);

	printf("%d\n", n * 2);
	printf("%.2lf\n", d);
}

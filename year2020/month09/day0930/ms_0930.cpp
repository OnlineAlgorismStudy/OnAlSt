#include <iostream>
#define PI 3.141592

using namespace std;

void circle(double radius);

int main() {
	double radius;

	cout << "radius : ";
	cin >> radius;

	circle(radius);

	return 0;
}

void circle(double r) {
	double value = r * r * PI;

	printf("area : %.3lf", value);
}
#include <iostream>

using namespace std;

int main() {
	double avg[] = { 85.6, 79.5, 83.1, 80.0, 78.2, 75.0 };
	int classA, classB;

	cin >> classA >> classB;

	printf("%.1lf", (avg[classA-1] + avg[classB-1]));

	return 0;
}
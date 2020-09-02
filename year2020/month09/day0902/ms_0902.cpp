#include <iostream>

using namespace std;

void Area(int n);

int main() {
	int n;

	cin >> n;
	Area(n);

	return 0;
}

void Area(int n) {
	printf("%.2lf", (n * n * 3.14));
}
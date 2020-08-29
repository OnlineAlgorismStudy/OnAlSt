#include <iostream>

using namespace std;

int main() {
	int base, height;
	char cnd;

	do {
		cout << "Base = ";
		cin >> base;

		cout << "Height = ";
		cin >> height;

		printf("Triangle width = %.1lf\n", (base * height / 2.0));
		
		cout << "Continue? ";
		cin >> cnd;
	} while (cnd == 'Y' || cnd == 'y');

	return 0;
}
#include <iostream>

using namespace std;

void printString();

int main() {
	int n;

	cin >> n;

	for (int i = 0; i < n; i++) {
		printString();
	}

	return 0;
}

void printString() {
	cout << "~!@#$^&*()_+|" << endl;
}
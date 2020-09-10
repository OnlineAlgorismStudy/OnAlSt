#include <iostream>
#include <string>

using namespace std;

void print();

int main() {
	string data[3] = { "first", "second", "third" };

	for (int i = 0; i < 3; i++) {
		cout << data[i] << endl;
		print();
	}

	return 0;
}

void print() {
	cout << "@@@@@@@@@@" << endl;
}
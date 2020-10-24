#include <iostream>
#include <cstring>

using namespace std;

int main() {
	string first;
	string second;

	cin >> first;
	cin >> second;

	if (first.length() < 20 && second.length() < 20)
		cout << first.length() + second.length() << endl;

	return 0;
}
#include <iostream>
#include <cstring>

using namespace std;

int main() {
	string data;

	cin >> data;

	if (data.length() <= 100)
		cout << data << data << endl;

	return 0;
}
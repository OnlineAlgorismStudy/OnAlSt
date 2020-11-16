#include <iostream>
#include <string>

using namespace std;

int main() {
	int data[5];

	for (int i = 0; i < 5; i++)
		scanf_s("%d", &data[i]);

	string str = "";

	for (int i = 0; i < 5; i++)
		str += to_string(data[i]);

	int len = str.length();

	while (len > 0) {
		if ((len - 3) <= 0) {
			cout << str.substr(0, len) << endl;
			str = str.substr(len);
		}
		else {
			cout << str.substr(0, 3) << endl;
			str = str.substr(3);
		}

		len = str.length();
	}

	return 0;
}
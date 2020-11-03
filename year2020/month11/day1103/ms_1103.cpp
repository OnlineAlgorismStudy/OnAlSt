#include <iostream>
#include <string>

using namespace std;

int main() {
	string data;

	getline(cin, data);

	if (data.length() <= 100) {
		while (data.length() != 1) {
			int len = data.length();
			int index;

			cin >> index;

			if (index >= len)
				index = len - 1;
			else
				index -= 1;

			data.replace(index, 1, "");

			cout << data << endl;
		}
	}

	return 0;
}
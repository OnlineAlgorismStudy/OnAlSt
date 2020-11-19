#include <iostream>
#include <string>

using namespace std;

int main() {
	string data[50];
	string word = "";
	int i = -1;

	while (word != "0" && i < 50) {
		getline(cin, word);

		if (word.length() <= 100) {
			i++;
			data[i] = word;
		}
	}

	cout << i << endl;

	for (int j = 0; j < i; j++) {
		if (j % 2 == 0) {
			cout << data[j] << endl;
		}
	}

	return 0;
}
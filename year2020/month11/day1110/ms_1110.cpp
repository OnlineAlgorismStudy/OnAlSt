#include <iostream>

// for string, function
#include <string>
#include <sstream>

// for strlen
#include <cstring>

using namespace std;

void ex_01();
void ex_02();

int main() {
	ex_01();
	//ex_02();

	return 0;
}

void ex_01() {
	string input;
	string data[2];

	getline(cin, input);

	stringstream ss(input);
	int i = 0;

	while (getline(ss, input, ' ')) {
		data[i] = input;
		i++;
	}

	if (data[0].length() <= 20 && data[1].length()) {
		string temp = data[0].substr(0, 2);

		data[1].replace(0, 2, temp);
		data[1] += temp;

		cout << data[1] << endl;
	}
}

void ex_02() {
	char data_A[21];
	char data_B[23];

	cin >> data_A >> data_B;

	if (strlen(data_A) <= 20 && strlen(data_B) <= 20) {
		int len = strlen(data_B);

		data_B[0] = data_A[0];
		data_B[1] = data_A[1];
		
		data_B[len++] = data_A[0];
		data_B[len++] = data_A[1];
		data_B[len] = '\0';

		cout << data_B << endl;
	}
}
#include <iostream>
#include <string>
#include <sstream>

using namespace std;

int main() {
	int data[4][2] = { 0, };

	for (int i = 0; i < 4; i++) {
		string temp;

		getline(cin, temp);
		stringstream ss(temp);

		int j = 0;
		while (getline(ss, temp, ' ')) {
			data[i][j] = stoi(temp);
			j++;
		}
	}

	int sum = 0;
	int column[2] = { 0, 0 };

	for (int i = 0; i < 4; i++) {
		column[0] += data[i][0];
		column[1] += data[i][1];

		int row = 0;
		for (int j = 0; j < 2; j++) {
			row += data[i][j];
			sum += data[i][j];
		}

		cout << row / 2 << ' ';
	}
	cout << endl;
	cout << column[0] / 4 << ' ' << column[1] / 4 << endl;
	cout << sum / 8 << endl;

	return 0;
}
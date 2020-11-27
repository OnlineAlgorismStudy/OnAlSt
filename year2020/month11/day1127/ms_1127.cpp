#include <iostream>
#include <vector>
#include <string>
#include <sstream>

using namespace std;

int main() {
	string input;
	vector<int> numbers;

	getline(cin, input);

	stringstream ss(input);
	int len = 0;

	while (getline(ss, input, ' ')) {
		int temp = stoi(input);

		if (0 <= temp && temp <= 100) {
			numbers.push_back(temp);
			len++;
		}
	}

	vector<int> answer;
	int count = 0;

	// insert sum of two value to answer
	if (2 <= len && len <= 100) {
		for (int i = 0; i < len - 1; i++) {
			for (int j = i + 1; j < len; j++) {
				int temp = numbers[i] + numbers[j];
				bool isIn = false;

				for (int h = 0; h < answer.size(); h++) {
					if (answer[h] == temp) {
						isIn = true;
					}
				}
				
				if (!isIn) {
					answer.push_back(temp);
					count++;
				}
			}
		}

		// selection sort
		for (int i = 0; i < count - 1; i++) {
			int index = i;

			for (int j = i + 1; j < count; j++) {
				if (answer[index] > answer[j]) {
					index = j;
				}
			}

			int temp = answer[index];
			answer[index] = answer[i];
			answer[i] = temp;
		}

		// print answer
		for (int i = 0; i < count; i++) {
			cout << answer[i];

			if (i != count) {
				cout << ' ';
			}
		}
	}

	return 0;
}
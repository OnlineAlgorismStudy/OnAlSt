#include <iostream>
#include <string>
#include <sstream>
#include <vector>

using namespace std;

double solution(vector<int> arr);

int main() {
	vector<int> arr;
	string input;

	getline(cin, input);
	stringstream ss(input);

	while (getline(ss, input, ' ')) {
		int temp = stoi(input);

		if (-10000 <= temp && temp <= 10000) {
			arr.push_back(temp);
		}
	}

	if (1 <= arr.size() && arr.size() <= 100) {
		cout << solution(arr) << endl;
	}

	return 0;
}

double solution(vector<int> arr) {
	double answer = 0;

	for (int i = 0; i < arr.size(); i++) {
		answer += arr[i];
	}

	answer /= arr.size();

	return answer;
}
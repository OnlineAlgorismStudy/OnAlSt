#include <iostream>
#include <string>
#include <vector>
#include <sstream>

using namespace std;

vector<int> input();
int solution(vector<int> a, vector<int> b);

int main() {
	vector<int> a = input();
	vector<int> b = input();

	if ((1 <= a.size() && a.size() <= 1000) && (1 <= b.size() && b.size() <= 1000)) {
		if (a.size() == b.size()) {
			cout << solution(a, b) << endl;
		}
	}

	return 0;
}

vector<int> input() {
	string Input;
	vector<int> temp;

	getline(cin, Input);

	stringstream ss(Input);

	while (getline(ss, Input, ' ')) {
		int value = stoi(Input);

		if (-1000 <= value && value <= 1000) {
			temp.push_back(value);
		}
	}

	return temp;
}

int solution(vector<int> a, vector<int> b) {
	int answer = 0;
	int len = a.size();

	for (int i = 0; i < len; i++) {
		answer += a[i] * b[i];
	}

	return answer;
}
#include <iostream>
#include <string>
#include <sstream>
#include <vector>
#include <algorithm> // for sort

using namespace std;

int main() {

	vector<string> v;

	for (int i = 0; i < 5; i++) {
		string input;
		cin >> input;
		v.push_back(input);
	}

	string s1, s2;
	cin >> s1 >> s2;

	int cnt = 0;
	for (int i = 0; i < 5; i++) {
		if (v[i].find(s1) != std::string::npos || v[i].find(s2) != std::string::npos) {
			cout << v[i] << endl;
			cnt++;
		}
	}

	if (cnt == 0)
		cout << "none" << endl;

	return 0;
}

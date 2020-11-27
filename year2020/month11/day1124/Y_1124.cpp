#include <iostream>
#include <string>
#include <sstream>
#include <vector>
#include <algorithm>

using namespace std;

int main() {

	string s1, s2;
	int n;
	cin >> s1 >> s2 >> n;

	string cut1 = s1.substr(0, n);
	string cut2 = s2.substr(n, s2.length() - n);

	cout << cut1 + cut2 << endl;
	return 0;
}

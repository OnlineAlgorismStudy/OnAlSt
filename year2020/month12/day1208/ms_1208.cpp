#include <iostream>
#include <string>

using namespace std;

string solution(int n);

int main() {
	int n;

	cin >> n;

	if (1 <= n && n <= 10000) {
		cout << solution(n) << endl;
	}

	return 0;
}

string solution(int n) {
	string answer = "";
	int len = 0;

	for (int i = 0; i < n / 2; i++) {
		answer += "¼ö¹Ú";
		len = (i + 1) * 2;
	}
	
	if (len != n) {
		answer += "¼ö";
	}

	return answer;
}
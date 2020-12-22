#include <iostream>
#include <vector>

using namespace std;

vector<int> solution(long long n);

int main() {
	long long n;

	cin >> n;

	if (1 <= n && n <= 10000000000) {
		vector<int> answer = solution(n);

		for (int i = 0; i < answer.size(); i++) {
			cout << answer[i];

			if (i != answer.size()) {
				cout << ' ';
			}
		}
	}

	return 0;
}

vector<int> solution(long long n) {
	vector<int> answer;

	while (n > 0) {
		answer.push_back(n % 10);
		n /= 10;
	}

	return answer;
}
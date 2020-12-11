#include <iostream>

using namespace std;

int solution(int n);

int main() {
	int n;

	cin >> n;

	if (0 <= n && n <= 3000) {
		cout << solution(n) << endl;
	}
	
	return 0;
}

int solution(int n) {
	int answer = 0;

	for (int i = 1; i <= n; i++) {
		if (n % i == 0) {
			answer += i;
		}
	}

	return answer;
}
#include <iostream>
#include <string>

using namespace std;

string solution(int num);

int main() {
	int num;

	cin >> num;

	if (-2147483648 <= num && num <= 2147483647) {
		cout << solution(num) << endl;
	}
}

string solution(int num) {
	if (num % 2 == 0)
		return "Even";
	else
		return "Odd";
}
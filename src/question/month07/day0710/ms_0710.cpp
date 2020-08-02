#include <iostream>
#include <string>
#include <sstream>

using namespace std;

int main() {
	int n = 1;
	int sum = 0;

	cin >> n;
	cin.get();

	if (n <= 10) {
		string score;

		getline(cin, score);

		stringstream split(score);
		string subject;

		while (split >> subject) {
			sum += atoi(subject.c_str());
		}
		
		double avg = sum / (double)n;
		
		printf("avg : %.1lf\n", avg);
		
		if (avg >= 80)
			cout << "pass" << endl;
		else
			cout << "fail" << endl;
	}
	
	return 0;
}
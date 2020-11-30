#include <iostream>
#include <string>

using namespace std;

//				   0      1      2      3      4      5      6
string DAY[] = { "SUN", "MON", "TUE", "WED", "THU", "FRI", "SAT" };

string solution(int a, int b);
int find(int dateIndex, int date, int mode);

int main() {
	int a, b;

	cin >> a >> b;

	cout << solution(a, b) << endl;

	return 0;
}

string solution(int a, int b) {
	string answer = "";
	int maxDate = 31;
	int dateIndex = 3;

	for (int i = 1; i <= a; i++) {
		switch (i) {
			case 1:
			case 3:
			case 5:
			case 7:
			case 8:
			case 10:
			case 12:
				maxDate = 31;
				break;

			case 4:
			case 6:
			case 9:
			case 11:
				maxDate = 30;
				break;

			case 2:
				maxDate = 29;
				break;
		}

		if (i != a) dateIndex = find(dateIndex, maxDate, 1);
		else dateIndex = find(dateIndex, b, 0);
	}

	answer = DAY[dateIndex];

	return answer;
}

int find(int dateIndex, int date, int mode) {
	int index = (date + dateIndex - 1) % 7;

	if (mode == 1) {
		index += 1;

		if (index == 7)
			index = 0;
	}

	return index;
}
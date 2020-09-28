#include <iostream>
#include <cmath>

using namespace std;

// 1 : ������ ��� ���ϰ� �ݿø��� ��� �� return
// 0 : �ݿø��� ������ ��� ���ϰ� �ݿø��� ��� �� return
int getRound(double* p, int type);

int main() {
	double data[3];

	for (int i = 0; i < 3; i++)
		scanf_s("%lf", &data[i]);

	cout << getRound(data, 1) << endl;
	cout << getRound(data, 0) << endl;
	
	return 0;
}

int getRound(double* p, int type) {
	double sum = 0;

	if (type)
		for (int i = 0; i < 3; i++)
			sum += *(p + i);
	else
		for (int i = 0; i < 3; i++)
			sum += round(*(p + i));

	return round(sum / 3);
}

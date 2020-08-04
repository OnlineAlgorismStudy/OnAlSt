#define _CRT_SECURE_NO_WARNINGS
#include <iostream>
using namespace std;


int main() {
	double score[] = {85.6, 79.5, 83.1, 80.0, 78.2, 75.0};
	int c1, c2;
	scanf("%d %d", &c1, &c2);

	printf("%.1f\n", score[c1-1]+score[c2-1]);
}

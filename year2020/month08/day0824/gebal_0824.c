#include<stdio.h>

int main() {
	int n, sum, cnt = 0;
	int std[5] = { 0 };
	for (int i = 0; i < 5; i++) {
		sum = 0;
		for (int j = 0; j < 4; j++) {
			scanf(" %d", &n);
			sum += n;
		}
		std[i] = sum / 4;
	}
	for (int i = 0; i < 5; i++) {
		if (std[i] >= 80) {
			printf("pass\n");
			cnt++;
		}
		else {
			printf("fail\n");
		}
	}
	printf("Successfull : %d", cnt);
}

#include<stdio.h>

int main() {
	int n, score[11] = { 0 };
	while (1)
	{
		scanf(" %d", &n);
		if (n == 0) {
			for (int i = 10; i >= 0; i--) {
				if(score[i] != 0)
					printf("%d : %d person\n", (i * 10 == 0 ? 1 : i * 10), score[i]);
			}
			break;
		}
		score[n / 10]++;
	}
}

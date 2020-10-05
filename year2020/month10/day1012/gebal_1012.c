#include<stdio.h>

int n, m;
int cache[10] = { 0 };

void reculsive(int cnt, int sum) {
	if (cnt == 0) {
		if (m == sum) {
			for (int i = n; i > 0; i--) {
				printf("%d ", cache[i]);
			}
			printf("\n");
		}
		return;
	}
	for (int i = 1; i < 7; i++) {
		if (sum + i > m) break;
		cache[cnt] = i;
		reculsive(cnt - 1, sum + i);
	}
}

int main() {
	scanf("%d %d", &n, &m);
	reculsive(n, 0);
}

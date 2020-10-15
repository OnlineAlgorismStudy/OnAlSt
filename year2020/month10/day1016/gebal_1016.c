#include<stdio.h>

int cache[10], n;

void reculsive(int level) {
	if (level == 0) {
		for (int i = n; i > 0; i--) {
			printf("%d ", cache[i]);
		}
		printf("\n");
		return;
	}
	else if (level == n) {
		for (int i = 1; i < 7; i++) {
			cache[level] = i;
			reculsive(level - 1);
		}
	}
	else {
		for (int i = cache[level + 1]; i < 7; i++) {
			cache[level] = i;
			reculsive(level - 1);
		}
	}

}

int main() {
	scanf("%d", &n);
	reculsive(n);
}

#include<stdio.h>

int main() {
	int cache[35] = { 0 };
	char n;
	while (1) {
		scanf(" %c", &n);
		if (n < 65 || n > 90) {
			for (int i = 0; i < 35; i++) {
				if (cache[i] != 0)
					printf("%c : %d\n", i + 65, cache[i]);
			}
			break;
		}
		cache[n - 65]++;
	}
}

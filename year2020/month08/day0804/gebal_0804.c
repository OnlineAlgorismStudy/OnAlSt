#include<stdio.h>

int main() {
	int cache[100], i, chk;
	for (i = 0; i < 100; i++) {
		scanf(" %d", &cache[i]);
		if (cache[i] == 0) {
			chk = i;
			break;
		}
	}
	for (i = chk-1; i >= 0; i--) {
		printf("%d ", cache[i]);
	}
}

#include<stdio.h>
#define SEVEN 7

int main() {
	int cache[SEVEN];
	for (int i = 0; i < SEVEN; i++) {
		scanf("%d", &cache[i]);
	}
	for(int i = 0; i < 3; i++){
		for (int j = 0; j < SEVEN - 1; j++) {
			if (cache[j] > cache[j + 1]) {
				cache[j] ^= cache[j + 1];
				cache[j + 1] ^= cache[j];
				cache[j] ^= cache[j + 1];
			}
		}
	}
	for (int i = 0; i < SEVEN; i++) {
		printf("%d ", cache[i]);
	}
}

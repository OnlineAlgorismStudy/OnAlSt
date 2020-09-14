#include<stdio.h>

void print(int cache[]) {
	for (int i = 0; i < 10; i++) {
		printf("%d ", cache[i]);
	}
	printf("\n");
}

void bouble_sort(int cache[]) {
	for (int i = 0; i < 10; i++) {
		for (int j = 0; j < 9; j++) {
			if (cache[j] < cache[j + 1]) {
				cache[j] ^= cache[j+1];
				cache[j+1] ^= cache[j];
				cache[j] ^= cache[j+1];
			}
		}
		print(cache);
		
	}
}

int main() {
	int cache[10];
	for (int i = 0; i < 10; i++) {
		scanf(" %d", &cache[i]);
	}
	bouble_sort(cache);
}

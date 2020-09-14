#include<stdio.h>
#include<stdlib.h>

int compare(const void *a, const void *b) {
	if (*(int*)a < *(int*)b) return 1;
	else if (*(int*)a > *(int*)b) return -1;
	else return 0;
}

void rsort(int *cache, int n) {
	qsort(cache, n, sizeof(int), compare);
	for (int i = 0; i < n; i++)
		printf("%d ", cache[i]);
}

int main() {
	int n, cache[10], elem;
	scanf("%d", &n);
	for (int i = 0; i < n; i++) {
		scanf(" %d", &elem);
		cache[i] = elem;
	}
	rsort(cache, n);
}

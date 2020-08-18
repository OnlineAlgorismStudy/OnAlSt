int compare(const void* first, const void* second) {
	if (*(int*)first < *(int*)second) return 1;
	else if (*(int*)first > *(int*)second) return -1;
	else return 0;
}

int main() {
	int n, cache[20] = { 0 };
	scanf("%d", &n);
	for (int i = 0; i < n; i++) {
		scanf(" %d", &cache[i]);
	}
	qsort(cache, n, sizeof(int), compare);
	for (int i = 0; i < n; i++) {
		printf("%d ", cache[i]);
	}
}

int main() {
	int n, cache[100] = { 0 }, cnt = 0;
	while (1)
	{
		scanf(" %d", &n);
		if (n == 0) {
			printf("%d\n", cnt);
			for (int i = 0; i < cnt; i++) {
				if (cache[i] % 2 == 0) {
					printf("%d ", cache[i] / 2);
				}
				else {
					printf("%d ", cache[i] * 2);
				}
			}
			break;
		}
		cache[cnt] = n;
		cnt++;
	}
}

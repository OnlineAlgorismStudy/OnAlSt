#include<stdio.h>
#include<string.h>
#include<stdlib.h>
#include<ctype.h>
#include<math.h>

int main() {
	int i;
	double d;
	char s[31], buf[101] = "", tmp[31];
	
	scanf("%d %lf %s", &i, &d, s);
	d = floor(d * 1000 + 0.5) / 1000;

	snprintf(tmp, 30, "%d", i);
	strcat(buf, tmp);
	snprintf(tmp, 30, "%0.3lf", d);
	strcat(buf, tmp);
	strcat(buf, s);

	int len = (int)strlen(buf);
	int div = len / 2;
	if (len % 2 != 0) {
		div += 1;
	}
	printf("%d\n", len);
	for (int j = 0; j < len; j++) {
		if (j == div) {
			printf("\n");
		}
		printf("%c", buf[j]);
	}
	
}

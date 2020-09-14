#include<stdio.h>
#include<math.h>
#define sub(x, y) pow((x - y), 2)
#define add(x, y) pow((x + y), 3)

int main() {
	int a, b;
	scanf("%d %d", &a, &b);
	printf("(%d - %d) ^ 2 = %d\n", a, b, (int)sub(a,b));
	printf("(%d + %d) ^ 3 = %d\n", a, b, (int)add(a, b));
}

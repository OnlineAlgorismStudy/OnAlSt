#include<stdio.h>

typedef struct student{
	int a, b, c, sum;
} Student;

int main() {
	Student std[3];
	int total_a = 0, total_b = 0, total_c = 0, totla_sum = 0;
	for (int i = 0; i < 3; i++) {
		scanf("%d %d %d", &std[i].a, &std[i].b, &std[i].c);
		std[i].sum = std[i].a + std[i].b + std[i].c;
		total_a += std[i].a; total_b += std[i].b; total_c += std[i].c;
		totla_sum += std[i].sum;
	}
	for (int i = 0; i < 3; i++) {
		printf("%d %d %d %d\n", std[i].a, std[i].b, std[i].c, std[i].sum);
	}
	printf("%d %d %d %d", total_a, total_b, total_c, totla_sum);
}

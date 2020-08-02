#define _CRT_SECURE_NO_WARNINGS

#include<stdio.h>

int main() {
	int kor = 90;
	int mat = 80;
	int eng = 100;
	int sum = kor + mat + eng;

	printf("kor %d\n", kor);
	printf("mat %d\n", mat);
	printf("eng %d\n", eng);
	printf("sum %d\n", sum);
	printf("avg %d\n", sum / 3);
}
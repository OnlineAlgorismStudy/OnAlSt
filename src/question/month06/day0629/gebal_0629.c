#include<stdio.h>
int main() {
	int kor = 90, mat = 80, eng = 100;
	printf("kor %d\nmat %d\neng %d\nsum %d\navg %d", 
		kor, mat, eng, kor + mat + eng, (kor + mat + eng) / 3);
}

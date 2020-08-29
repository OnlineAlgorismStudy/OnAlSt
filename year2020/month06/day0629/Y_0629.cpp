#include <iostream>
using namespace std;

int main() {
	// subject score
	int kor = 90, mat = 80, eng =100;
	
	// print score, sum, average
	printf("kor %d\n", kor);
	printf("mat %d\n", mat);
	printf("eng %d\n", eng);
	printf("sum %d\n", kor + mat + eng);
	printf("avg %d\n", (kor + mat + eng) / 3);
	return 0;
}

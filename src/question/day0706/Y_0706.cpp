#include <iostream>
using namespace std;

int main() {
    int year;
    scanf("%d", &year);

    if(year%400 == 0 || (year%4 == 0 && year%100 != 0)) {
        printf("leap year\n");
    } else {
        printf("common year\n");
    }
	return 0;
}

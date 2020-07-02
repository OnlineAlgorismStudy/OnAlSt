#define _CRT_SECURE_NO_WARNINGS
#include <iostream>
using namespace std;
#define CM 91.44

int main() {
  double yard;
	printf("yard? ");
	scanf("%lf", &yard);

	printf("%.1fyard = %.1fcm\n", yard, yard * CM);
}

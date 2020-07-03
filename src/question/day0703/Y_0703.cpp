#include <iostream>
using namespace std;

int main() {
    int width, length;
    scanf("%d %d", &width, &length);

    width += 5;
    length *= 2;
    
    printf("width = %d\n", width);
    printf("length = %d\n", length);
    printf("area = %d\n", width * length);
    return 0;
}

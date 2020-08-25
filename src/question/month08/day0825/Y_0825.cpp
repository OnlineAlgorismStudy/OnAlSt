#include <iostream>

using namespace std;

int score[10] = {0};

int main() {
	int num;
	while(true)
	{
		scanf(" %d", &num);
		if(num == 0)
			break;

		score[num/10] += 1;
	}

	for(int i=10; i>=0; i--)
	{
		if(score[i] > 0)
		{
			printf("%d : %d person\n", i*10, score[i]);
		}
	}
}

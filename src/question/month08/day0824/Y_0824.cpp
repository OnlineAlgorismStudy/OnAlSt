#define _CRT_SECURE_NO_WARNINGS
#include <iostream>
#include <vector>
#include <algorithm>
using namespace std;

struct STUDENT 
{
	int kor, eng, math, sci;
	int avg;
};

int main() {
	struct STUDENT s[5];

	for(int i=0; i<5; i++)
	{
		scanf("%d %d %d %d", &s[i].kor, &s[i].eng, &s[i].math, &s[i].sci);
		int sum = s[i].kor + s[i].eng + s[i].math + s[i].sci;
		s[i].avg = sum/4;
	}

	int success = 0;
	for(int i=0; i<5; i++)
	{
		if(s[i].avg >= 80)
		{
			printf("pass\n");
			success++;
		}
		else
			printf("fail\n");
	}
	printf("Successful : %d\n", success);
}

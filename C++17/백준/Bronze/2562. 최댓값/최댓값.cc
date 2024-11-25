#define _CRT_SECURE_NO_WARNINGS
#include <stdio.h>
int main()
{
	int a, b, c, d;
	a = 9;
	int max;
	int score[9];
	for (c = 0; c < 9; c++)
	{
		scanf(" %d", &score[c]);
	
	}
	max = score[0];
	for (c = 0; c < 9; c++)
	{
		if (max < score[c])
		{
			max = score[c];
		}
		if (max == score[c])
		{
			d = c;
		}
	}
	printf("%d %d", max, d + 1);
	return 0;

}
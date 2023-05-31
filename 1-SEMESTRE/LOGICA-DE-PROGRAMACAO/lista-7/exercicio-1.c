#include <stdio.h>

int main(int argc, char **argv)
{
	int num, i, limit;
	
	printf("Digite um numero para que seja efetuada sua tabuada: ");
	scanf("%d", &num);
	
	printf("Digite ate qual valor deseja que seja feita a tabuada: ");
	scanf("%d", &limit);
	
	for(i =1; i<= limit; i++)
	{
		printf("%d x %d = %d \n",num, i, num*i );
		};
	
	return 0;
}


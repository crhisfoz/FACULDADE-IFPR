#include <stdio.h>
#include <math.h>

int main(int argc, char **argv)
{
	int num=10, i=0, mult =6, total =0;
	
	while(i < 10){
		num = i+1;
		total = mult*num;
		printf("\n %d X %d = %d", mult,num,total);
		i++;
		}
	
	return 0;
}


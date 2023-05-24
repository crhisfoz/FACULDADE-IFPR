#include <stdio.h>

int main(int argc, char **argv)
{
	int num;
	
	do{
		printf("\n Digite um numero inteiro entre 0 e 10: ");
		scanf(" %d", &num);
		if(num >= 0 && num <= 10){
			printf("\n %d", num);
		} else{
			printf("\n Numero fora do intervalo");
			};
	}while(num < 0 || num > 10);
		
	
	return 0;
}

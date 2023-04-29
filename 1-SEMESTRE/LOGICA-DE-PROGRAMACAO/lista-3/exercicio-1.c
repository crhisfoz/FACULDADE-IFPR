
#include <stdio.h>

int main(int argc, char **argv)
{
	int num;
	printf("Digite um numero inteiro: ");
	scanf("%d", &num);
	
	if( num > 0){
		printf("O numero %d e Positivo", num);
	}else if(num == 0){
		printf("O numero %d e Nulo", num);
		}
	else{
		printf("O numero %d e Negativo", num);
	}
	
	return 0;
}


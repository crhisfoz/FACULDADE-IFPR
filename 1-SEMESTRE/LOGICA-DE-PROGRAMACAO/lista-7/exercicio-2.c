#include <stdio.h>

int main(int argc, char **argv)
{
	float valor,min=0, max=0, media=0;
	int count =0;
		
	for(int i=0; i < 5; i++)
		{
			printf("Digite o \'%d\o' valor real: \n", i+1);
			scanf("%f", &valor);
			
			if(i == 0){
				max =valor;
				min = valor;
			}else if(valor < min){
				min = valor;
			} else if(valor > max){
				max = valor;
				};
			if(valor > 5.9){
				media += valor;
				count++;
				};
			};
		printf("O menor valor e %.1f \n", min);
		printf("O maior valor e %.1f \n", max);
		printf("A media dos valores maiores que \'5,9\' e = %.1f \n", media/count);

	return 0;
}


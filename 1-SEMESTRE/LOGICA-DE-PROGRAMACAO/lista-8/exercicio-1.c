#include <stdio.h>

int main(int argc, char **argv)
{
	int vetor[5], vetor2[5], i;
	printf("Voce ira digitar 5 numeros inteiros que sera calculado seu dobro. \n");
	
	for(i=0; i<5; i++)
	{
		printf("Digite o %do numero: ",i+1);
		scanf("%d", &vetor[i]);
		
		vetor2[i] = vetor[i] * 2;
			
}

for(i=0; i<5; i++){
	printf("O %do numero digitado foi %d e seu dobro e igual a = %d \n", i+1, vetor[i], vetor2[i]);
	
	};
	
	
	return 0;
}


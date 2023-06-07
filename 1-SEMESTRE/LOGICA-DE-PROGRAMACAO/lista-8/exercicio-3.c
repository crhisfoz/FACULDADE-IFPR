#include <stdio.h>
#define TAM 100

int main(int argc, char **argv)
{
	int vetor1[TAM] ={0}, vetor2[TAM] ={0}, tam, prod_escalar = 0, i;
	
	printf("Digite o tamanho do 1o vetor: \n");
	scanf("%d", &tam);
	for (i=0; i<tam; i++){
		printf("Digite o %o elemento do 1o vetor \n ", i+1);
		scanf("%d", &vetor1[i]);
		
		printf("Digite o %o elemento do 2o vetor \n ", i+1);
		scanf("%d", &vetor2[i]);
		prod_escalar += (vetor1[i] * vetor2[i]);	
	};
	printf("%d", prod_escalar);
	return 0;
}


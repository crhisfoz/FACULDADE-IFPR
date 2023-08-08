#include <stdio.h>
#define TAM 20


int main(int argc, char **argv)
{
	float notas[TAM], media =0, total =0;
	int i, nota_acima =0;
	

	for (i=0; i<TAM; i++){
		printf("Digite a %da nota: ", i+1);
		scanf("%f", &notas[i]);
		total += notas[i];	
	}
	
	media = total /TAM;
	
	for(i=0; i<TAM; i++){
		if(notas[i] > media ){
			nota_acima++;
			}
		}
	printf("Media total e igual a %.1f: \n", media);
	printf("A quantidade de alunos com notas acima da media e %d: \n", nota_acima);
	return 0;
}


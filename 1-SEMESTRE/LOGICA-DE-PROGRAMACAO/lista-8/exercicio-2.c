#include <stdio.h>

int main(int argc, char **argv)
{
	int vetor[10], vetor2[10], i;
	printf("Voce ira digitar 10 numeros inteiros que sera verificado se o valor é PAR e sera multiplicado por 5, se for impar ele sera somado com 5. \n");
	
	for(i=0; i<10; i++)
	{
		printf("Digite o %do numero: ",i+1);
		scanf("%d", &vetor[i]);
		
		if(vetor[i]%2 ==0){
			vetor2[i] = vetor[i] * 5;
			}else{
				vetor2[i] = vetor[i] + 5;
				};			
}

for(i=0; i<10; i++){
	if(vetor[i]%2 == 0){
		printf("O %do numero digitado e %d, ele e PAR multiplicado por 5 e igual a = %d \n", i+1, vetor[i], vetor2[i]);
		}else{
			printf("O %do numero digitado e %d, ele e IMPAR adicionado com 5 e igual a = %d \n", i+1, vetor[i], vetor2[i]);
			};
	
	
	};
	
	
	return 0;
}


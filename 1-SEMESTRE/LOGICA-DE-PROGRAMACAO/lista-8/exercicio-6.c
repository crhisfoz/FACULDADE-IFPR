#include <stdio.h>
#define TAM 20

int main() {
    int vetor[TAM], menor = 99999,posicao = 0;

    for (int i = 0; i < TAM; i++) {
		if( i < 0){
			printf("Valor invalido, Digite um numero positivo para a posicao %d: ", i+1);
			scanf("%d", &vetor[i]);
			};
        printf("Digite um numero positivo para a posicao %d: ", i+1);
        scanf("%d", &vetor[i]);
        if (vetor[i] < menor) {
            menor = vetor[i];
            posicao = i+1;
        }
    }

    printf("O menor elemento do vetor e %d e esta na posicao %d\n", menor, posicao);

    return 0;
}

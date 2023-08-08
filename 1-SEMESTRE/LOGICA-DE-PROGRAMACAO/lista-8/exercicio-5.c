#include <stdio.h>
#define TAM 20

int main() {
    int vetor[TAM], maior = 0,posicao = 0;

    for (int i = 0; i < TAM; i++) {
        printf("Digite um numero positivo para a posicao %d: ", i);
        scanf("%d", &vetor[i]);
        while (vetor[i] < 0) {
            printf("Valor invalido, Digite um numero positivo para a posicao %d: ", i);
            scanf("%d", &vetor[i]);
        }
        if (vetor[i] > maior) {
            maior = vetor[i];
            posicao = i;
        }
    }

    printf("O maior elemento do vetor e %d e esta na posicao %d.\n", maior, posicao);

    return 0;
}

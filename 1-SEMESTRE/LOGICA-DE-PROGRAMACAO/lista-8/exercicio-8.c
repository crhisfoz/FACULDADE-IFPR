#include <stdio.h>
#define TAM 10

int main() {
    int vetor[TAM], vetor_inverso[TAM];

    for (int i = 0; i < TAM; i++) {
        printf("Digite um numero positivo para a posicao %d: ", i+1);
        scanf("%d", &vetor[i]);
        while (vetor[i] < 0) {
            printf("Valor invalido, Digite um numero positivo para a posicao %d: ", i);
            scanf("%d", &vetor[i]);
        }
        vetor_inverso[TAM - 1 - i] = vetor[i];
    }

    printf("Vetor original: ");
    for (int i = 0; i < TAM; i++) {
        printf("%d ", vetor[i]);
    }
    printf("\n");

    printf("Vetor invertido: ");
    for (int i = 0; i < TAM; i++) {
        printf("%d ", vetor_inverso[i]);
    }
    printf("\n");

    return 0;
}

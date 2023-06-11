#include <stdio.h>
#include <ctype.h>
#define TAM 100

int main() {
    int i, j, linhas, colunas;
    float matrizA[TAM][TAM], matrizB[TAM][TAM], matrizC[TAM][TAM] = {0};

    printf("Digite quantas linhas a Matriz deve ter: ");
    scanf("%d", &linhas);
    printf("Digite quantas colunas a Matriz deve ter: ");
    scanf("%d", &colunas);

    for (i = 0; i < linhas; i++) {
        for (j = 0; j < colunas; j++) {
            printf("Digite o valor da coluna %d da linha %d da PRIMEIRA matriz[%d][%d]: ", j + 1, i + 1, i, j);
            scanf("%f", &matrizA[i][j]);
        }
    }
    
     for (i = 0; i < linhas; i++) {
        for (j = 0; j < colunas; j++) {
            printf("Digite o valor da coluna %d da linha %d  da SEGUNDA matriz[%d][%d]: ", j + 1, i + 1, i, j);
            scanf("%f", &matrizB[i][j]);
        }
    }
    
    for (i = 0; i < linhas; i++) {
        for (j = 0; j < colunas; j++) {

            matrizC[i][j] = matrizA[i][j] + matrizB[i][j];
        }
    }
    
 

    printf("A Matriz C resultante de (A + B):\n");
    for (i = 0; i < linhas; i++) {
        for (j = 0; j < colunas; j++) {
            printf("\t%.1f ", matrizC[i][j]);
        }
        printf("\n");
    }
    return 0;
}

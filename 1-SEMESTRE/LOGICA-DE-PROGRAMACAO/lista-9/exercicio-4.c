#include <stdio.h>
#include <ctype.h>
#define TAM 100

int main() {
    int i, j, linhas, colunas;
    float matrizA[TAM][TAM], matrizT[TAM][TAM];

    printf("Digite quantas linhas a Matriz deve ter: ");
    scanf("%d", &linhas);
    printf("Digite quantas colunas a Matriz deve ter: ");
    scanf("%d", &colunas);

    for (i = 0; i < linhas; i++) {
        for (j = 0; j < colunas; j++) {
            printf("Digite o valor da coluna %d da linha %d da matriz[%d][%d]: ", j + 1, i + 1, i, j);
            scanf("%f", &matrizA[i][j]);
        }
    }

    for (i = 0; i < linhas; i++) {
        for (j = 0; j < colunas; j++) {

            matrizT[i][j] = matrizA[j][i];
        }
    }
    
 

    printf("A Matriz Transporta da Matriz A:\n");
    for (i = 0; i < linhas; i++) {
        for (j = 0; j < colunas; j++) {
            printf("\t%.1f ", matrizT[i][j]);
        }
        printf("\n");
    }
    return 0;
}

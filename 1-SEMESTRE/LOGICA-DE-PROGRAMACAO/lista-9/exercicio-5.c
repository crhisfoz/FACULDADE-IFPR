#include <stdio.h>

int main() {
    int i, j, matriz[5][5], option, soma =0, valor, encontrado=0;

    for (i = 0; i < 5; i++) {
        for (j = 0; j < 5; j++) {
            printf("Digite o valor da coluna %d da linha %d da Matriz[%d][%d]: ", j + 1, i + 1, i, j);
            scanf("%d", &matriz[i][j]);
        }
    }
    
    do {
        printf("\n Menu:\n");
        printf("1. Mostrar todos os elementos da Matriz.\n");
        printf("2. Mostrar todos os elementos da quarta linha da matriz e da primeira coluna da matriz.\n");
        printf("3. Mostrar a soma dos elementos da diagonal principal.\n");
        printf("4. Atribuir o valor 0 para valores negativos encontrados fora da diagional principal.\n");
        printf("5. Buscar um elemento na matriz.\n");
        printf("9. Sair.\n");
        printf("Digite sua opcao: ");
        scanf(" %d", &option);
        switch (option) {
            case 1:
				printf("Elementos da Matriz: \n");
                for (int i = 0; i < 5; i++) {
                    for (int j = 0; j < 5; j++) {
                        printf("%d ", matriz[i][j]);
                    }
                    printf("\n");
                }
                break;
            case 2:
				  printf("Elementos da 4a linha da Matriz:");
                for (int j = 0; j < 5; j++) {
					printf("%d ", matriz[3][j]);
                }
                printf("\nElementos da 1a coluna:");
                for (int i = 0; i < 5; i++) {
					printf("%d ", matriz[i][0]);
                }
                printf("\n");
                break;
            case 3:
				for(i=0; i<5; i++){
					soma += matriz[i][i];
					}
					printf("Soma dos elementos da Diagonal Principal: %d\n", soma);
                break;
            case 4:
                for (int i = 0; i < 5; i++) {
                    for (int j = 0; j < 5; j++) {
                        if (i != j && matriz[i][j] < 0) {
                            matriz[i][j] = 0;
                        }
                    }
                }
                printf("Valores negativos fora da Diagonal Principal substituidos por 0.\n");
                break;
            case 5:
				printf("Entre com o valor para procurar: ");
				scanf("%d", &valor);
				for (int i = 0; i < 5 && !encontrado; i++) {
                    for (int j = 0; j < 5 && !encontrado; j++) {
						if(matriz[i][j] == valor){
							encontrado = 1;
							printf("Valor encontrado na linha %d e coluna %d.\n", i+1, j+1);
							};
					}
				}
				if(!encontrado){
					printf("Valor nao encontrado");
					};
				break;
			case 9:
				printf("Finalizando o Programa, ate logo.\n");
				break;
            default:
                printf("Opcao Invalida, tente novamente.\n");
                break;
        }
    } while (option != 9);
    return 0;
}

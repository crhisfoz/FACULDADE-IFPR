#include <stdio.h>
#include <ctype.h>
# define TAM 3

int main() {
    int i,j, linha;
    float matriz[TAM][TAM];
    
    for(i=0; i<TAM; i++){
		for(j=0; j<TAM; j++){
			printf("Digite o valor de matriz[%d][%d]: ", i, j);
			scanf("%f", &matriz[i][j]);
			
			}			
		}
		printf("Digite o numero da linha da Matriz que deseja exibir: ");
		scanf(" %d", &linha);
			
		 if (linha >= 0 && linha < TAM) {
            printf("Os valores da linha %d sao: ", linha);
            for (j = 0; j < TAM; j++) {
                printf("%.2f ", matriz[linha][j]);
            }
            printf("\n");
        } else {
            printf("Linha invalida.\n");
        }
		
		
    return 0;
}

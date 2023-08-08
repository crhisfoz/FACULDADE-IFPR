#include <stdio.h>
# define TAM 8

int main() {
    int i,j, matriz[8][8], menor=99999, maior =0, linha_menor =0, coluna_menor =0, linha_maior, coluna_maior=0;
    
    for(i=0; i<TAM; i++){
		for(j=0; j<TAM; j++){
			printf("Digite o valor de matriz[%d][%d]: ", i, j);
			scanf("%d", &matriz[i][j]);
			
			if(matriz[i][j] > maior){
				maior = matriz[i][j];
				linha_maior= i;
				coluna_maior=j;
				}
			if( matriz[i][j] < menor){
				menor = matriz[i][j];
				linha_menor= i;
				coluna_menor=j;
			}
			}
				
		}
		
		printf("O menor valor da Matriz e %d ele esta localizado na posicao %d e %d \n", menor, linha_menor, coluna_menor);
		printf("O maior valor da Matriz e %d ele esta localizado na posicao %d e %d \n", maior, linha_maior, coluna_maior);

    return 0;
}

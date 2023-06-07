#include <stdio.h>
#define TAM 20
int main() {
    int vetor[TAM], menor = 99999, maior =0, posicao_maior = 0, posicao_menor =0;
// sei que as posicoes do vetor comecam em 0, mas como não sei se é para colocar isso, resolvir colocar como i+1
    for (int i = 0; i < TAM; i++) {
        printf("Digite um numero positivo para a posicao %d: ", i+1);
        scanf("%d", &vetor[i]);
        while (vetor[i] < 0) {
            printf("Valor invalido, Digite um numero positivo para a posicao %d: ", i+1);
            scanf("%d", &vetor[i]);
        }
        
        if (vetor[i] < menor) {
            menor = vetor[i];
            posicao_menor = i+1;
        }else{
			if(vetor[i] > maior){
			maior = vetor[i];
			posicao_maior = i+1;
		}
	};
  }

    printf("O menor elemento do vetor e \'%d\' e esta na posicao %d do vetor, o maior elemento e \'%d\' e esta na posicao %d do vetor \n", menor,posicao_menor, maior, posicao_maior);

    return 0;
}

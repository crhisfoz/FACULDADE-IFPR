#include <stdio.h>
#include <ctype.h>

int main() {
    int idade, maior_idade = 0, menor_idade = 999, homem_mais_novo = 999;
    char sexo, resposta;
    float peso, maior_peso = 0, menor_peso = 999;

    do {
        do {
            printf("Digite o sexo da pessoa (F ou M): ");
            scanf(" %c", &sexo);
            sexo = toupper(sexo);

            if (sexo != 'F' && sexo != 'M') {
                printf("Sexo inválido. Digite F para feminino ou M para masculino.\n");
            }
        } while (sexo != 'F' && sexo != 'M');

        printf("Digite a idade da pessoa: ");
        scanf("%d", &idade);

        printf("Digite o peso da pessoa: ");
        scanf("%f", &peso);

        if (sexo == 'F') {
            if (idade > maior_idade) {
                maior_idade = idade;
            }
        } else if (sexo == 'M') {
            if (idade < homem_mais_novo) {
                homem_mais_novo = idade;
            }
        }

        if (idade < menor_idade) {
            menor_idade = idade;
        }

        if (peso > maior_peso) {
            maior_peso = peso;
        }

        if (peso < menor_peso) {
            menor_peso = peso;
        }

        do {
            printf("Deseja inserir os dados de outra pessoa? (S/N): ");
            scanf(" %c", &resposta);
            resposta = toupper(resposta);

            if (resposta != 'S' && resposta != 'N') {
                printf("Resposta incorreta. Por favor, responda 'S' ou 'N'.\n");
            }
        } while (resposta != 'S' && resposta != 'N');

    } while (resposta == 'S');
    
     
    printf("A mulher mais velha tem %d anos.\n", maior_idade);
    
    if(homem_mais_novo != 999){
		printf("O homem mais novo tem %d anos.\n", homem_mais_novo);
		}else{
		printf("Nao houve homens nessa pesquisa. \n");
		};
    printf("A pessoa mais pesada tem %.2f kg.\n", maior_peso);
    printf("A pessoa mais leve tem %.2f kg.\n", menor_peso);
    printf("\nEncerrando o programa.\n");

    return 0;
}

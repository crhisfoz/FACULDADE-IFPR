#include <stdio.h>
#include <ctype.h>

int main() {
    char resposta;

    do {
        float notaA, notaB, media;

        printf("Digite a nota A do aluno: ");
        scanf("%f", &notaA);

        printf("Digite a nota B do aluno: ");
        scanf("%f", &notaB);

        media = (notaA + (notaB * 2)) / 3;
        printf("A media ponderada do aluno e: %.1f\n", media);

        do {
            printf("\n Deseja inserir as notas de outro aluno? Responda \'S\' para Sim ou \'N\' para Nao: ");
            scanf(" %c", &resposta);
            resposta = toupper(resposta);

            if (resposta != 'S' && resposta != 'N') {
                printf("\n Resposta incorreta. Por favor, responda 'S' ou 'N'.");
            }
        } while (resposta != 'S' && resposta != 'N');

    } while (resposta == 'S');

    printf("\n Encerrando o programa.");

    return 0;
}

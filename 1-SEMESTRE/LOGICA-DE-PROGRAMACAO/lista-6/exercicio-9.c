#include <stdio.h>
#include <ctype.h>

int main() {
    int idade, count=0, menor_idade = 999, condicao_masc = 0, condicao_fem = 0;
    char genero, cor_olhos, cor_cabelos;
    printf("Pesquisa de caracteristicas pessoais !!! ");

    while (count < 50) {
        
       printf("Pessoa %d:\n", count + 1);

        printf("Gênero utilize: M (Masculino) e F (Feminino); ");
        scanf(" %c", &genero);
        genero = toupper(genero);

        printf("Cor dos olhos utilize: A (Azuis), V (Verdes), P (Pretos) e C (Castanhos);");
        scanf(" %c", &cor_olhos);
        cor_olhos = toupper(cor_olhos);

        printf("Cor dos cabelos utilize: L (Louros), C (Castanhos) e P (Pretos); ");
        scanf(" %c", &cor_cabelos);
        cor_cabelos = toupper(cor_cabelos);
        

        printf("Idade: ");
        scanf("%d", &idade);

        if (idade < menor_idade) {
            menor_idade = idade;
        }

        if (genero == 'M' && idade >= 16 && idade <= 24 && cor_olhos == 'A' && cor_cabelos == 'C') {
            condicao_masc++;
        }

        if (genero == 'F' && idade < 40 && cor_olhos == 'P' && cor_cabelos == 'P') {
            condicao_fem++;
        }

        count++;
    }

    printf("Menor idade do grupo: %d\n", menor_idade);
    printf("Quantidade de Homens, entre 16 e 24 anos, com olhos azuis e cabelos castanhos: %d\n", condicao_masc);
    printf("Quantidade de Mulhere com idade menor que 40 anos, e olhos e cabelos pretos: %d\n", condicao_fem);

    return 0;
}

#include <stdio.h>
#include <ctype.h>

int main() {
    int age, older, younger, sum_age_women = 0, count_women = 0, count_men = 0;
    char genero;

    printf("Digite a idade e o genero de 10 pessoas, use \'M\' para Masculino ou \'F\' para Feminino:\n");

    int i = 1;
    while (i <= 10) {
        printf("Pessoa %d:\n", i);
        
        printf("Idade: ");
        scanf("%d", &age);

        printf("Genero \'M\' ou \'F\': ");
        scanf(" %c", &genero);
        genero = toupper(genero);

        if (i == 1) {
            older = age;
            younger = age;
        } else {
            if (age > older) {
                older = age;
            }
            if (age < younger) {
                younger = age;
            }
        }

        if (genero == 'F' || genero == 'f') {
            sum_age_women += age;
            count_women++;
        } else if (genero == 'M' || genero == 'm') {
            count_men++;
        }

        i++;
    }

    printf("\nResultados:\n");
    printf("Maior idade: %d\n", older);
    printf("Menor idade: %d\n", younger);

    if (count_women > 0) {
        float media_age_women = (float) sum_age_women / count_women;
        printf("Media de idade das mulheres: %.f\n", media_age_women);
    } else {
        printf("Nao foram informadas idades de mulheres.\n");
    }

    printf("Numero de homens: %d\n", count_men);

    return 0;
}

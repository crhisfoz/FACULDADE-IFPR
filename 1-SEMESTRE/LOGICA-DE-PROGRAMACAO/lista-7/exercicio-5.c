#include <stdio.h>

int main() {
    float inicio, fim;
    int int_pos = 0;
    int par = 0;
    int impar = 0;
    int impar_div = 0;
    float media_int_pos = 0;
    float media_par = 0;
    float media_impar = 0;
    float media_impar_div = 0;

    do {
        printf("Digite o valor inicial: ");
        scanf("%f", &inicio);
        printf("Digite o valor final: ");
        scanf("%f", &fim);
        if (fim < inicio) {
            printf("Erro: o valor final deve ser maior que o valor inicial.\n");
        }
    } while (fim < inicio);

    for (int i = (int)inicio+1; i < fim; i++) {
        if (i > 0) {
            int_pos++;
            media_int_pos += i;
        }
        if (i % 2 == 0) {
            par++;
            media_par += i;
        } else {
            impar++;
            media_impar += i;
            if (i % 12 == 0) {
                impar_div++;
                media_impar_div += i;
            }
        }
    }

    if (int_pos > 0) {
        media_int_pos /= int_pos;
    }
    if (par > 0) {
        media_par /= par;
    }
    if (impar > 0) {
        media_impar /= impar;
    }
    if (impar_div > 0) {
        media_impar_div /= impar_div;
    }

    printf("Quantidade de numeros inteiros e positivos: %d \n", int_pos);
    printf("Quantidade de numeros pares: %d \n", par);
    printf("Quantidade de numeros impares: %d \n", impar);
    printf("Quantidade de numeros impares e divisiveis por 3 e 4 ao mesmo tempo: %d \n", impar_div);
    printf("Media de numeros inteiros e positivos: %.2f \n", media_int_pos);
    printf("Media de numeros pares: %.2f \n", media_par);
    printf("Media de numeros impares: %.2f \n", media_impar);
    printf("Media de numeros impares e divisiveis por 3 e 4 ao mesmo tempo: %.2f \n", media_impar_div);

    return 0;
}

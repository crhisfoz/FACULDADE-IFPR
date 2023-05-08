#include <stdio.h>

int main() {
    int n, num, soma_par = 0, soma_impar = 0, i = 0;

    printf("Digite a quantidade de numeros da sequencia: ");
    scanf("%d", &n);

    while(i < n) {
        printf("Digite o %do numero: ", i+1);
        scanf("%d", &num);
        
        if(num % 2 == 0) {
            soma_par += num;
        } else {
            soma_impar += num;
        }

        i++;
    }

    printf("Soma dos numeros pares: %d\n", soma_par);
    printf("Soma dos numeros impares: %d\n", soma_impar);

    return 0;
}

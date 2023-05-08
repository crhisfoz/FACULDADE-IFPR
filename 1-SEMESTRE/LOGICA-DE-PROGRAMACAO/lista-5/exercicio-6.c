#include <stdio.h>

int main() {
    int n=15, i=0, soma=0, num, maior10=0;
    float media=0.0;

    while(i < n) {
        printf("Digite o %do numero: ", i+1);
        scanf("%d", &num);
        
        if(num > 10) {
            soma += num;
            maior10++;
        }	
        i++;
    }

    if(maior10 > 0){
        media = soma / (float)maior10; // converte para float para garantir a precisao da media
        printf("A media dos numeros maiores que 10 eh %.2f\n", media);
    } else {
        printf("Nao ha numeros maiores que 10 para calcular a media.\n");
    }

    return 0;
}

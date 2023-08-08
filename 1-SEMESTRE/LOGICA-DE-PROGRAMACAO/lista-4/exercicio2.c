#include <stdio.h>

int main(){
    int num;
    printf("Digite um numero de 1 a 7: ");
    scanf("%d", &num);

    switch (num)
    {
    case 1:
        printf("Dia correspondente: Domingo");
        break;
    case 2:
        printf("Dia correspondente: Segunda-feira");
        break;
    case 3:
        printf("Dia correspondente: Terça-feira");
        break;
    case 4:
        printf("Dia correspondente: Quarta-feira");
        break;
    case 5:
        printf("Dia correspondente: Quinta-feira");
        break;
    case 6:
        printf("Dia correspondente: Sexta-feira");
        break;
    case 7:
        printf("Dia correspondente: Sábado");
        break;        

    default:
        printf("Numero nao corresponde a nenhum dia da semana");
        break;
    }
    return 0;
}

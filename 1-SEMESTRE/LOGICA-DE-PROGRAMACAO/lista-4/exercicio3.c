#include <stdio.h>

int main (){
    int mes;
    printf("Digite um numero de 1 a 12, correspondente aos meses do ano: ");
    scanf("%d", &mes);

    switch (mes)
    {
    case 1:
    case 2:
    case 3:
        printf("O mes \'%d\' pertence ao 1º Trimestre.", mes);
        break;
    case 4:
    case 5:
    case 6:
        printf("O mes \'%d\' pertence ao 2º Trimestre.", mes);
        break;
    case 7:
    case 8:
    case 9:
        printf("O mes \'%d\' pertence ao 3º Trimestre.", mes);
        break;
    case 10:
    case 11:
    case 12:
        printf("O mes \'%d\' pertence ao 4º Trimestre.", mes);
        break;

    default:
        printf("o valor digitado nao corresponde a nenhum mes");
        break;
    }
    return 0;
}
